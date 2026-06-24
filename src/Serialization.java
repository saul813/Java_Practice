import javax.xml.namespace.QName;
import java.io.*;
class Student1 implements Serializable {
    public String Name;
    public Student1 (String Name){
        this.Name = Name;
    }
    public String toString(){
        return Name;
    }
}
public class Serialization {

    public static void serializeObject(Student1 student, String fileName) throws IOException{
        try(
            FileOutputStream fo = new FileOutputStream(fileName);
            ObjectOutputStream oo = new ObjectOutputStream(fo);){
            oo.writeObject(student);
        }

    }
    public static Student1 deserializeObject(String fileName) throws IOException, ClassNotFoundException{
        try(FileInputStream fi = new FileInputStream(fileName);
            ObjectInputStream oi = new ObjectInputStream(fi);
        ){
            return (Student1) oi.readObject();
        }
    }
    public static void main(String[] args){
        String fileName = "Student1.ser";
        Student1 originalStudent1 = new Student1("Saul_Sabunyo");

        try{
            //Step1: Serialization
            serializeObject(originalStudent1,fileName);
            System.out.println("Serialization Complete");
            //Step2: Deserialization
            Student1 loadedStudent = deserializeObject(fileName);
            System.out.println("Deserialized Object "+ loadedStudent.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
