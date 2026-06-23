 import java.io.*;

    // Class Students implements the Serializable Marker....an interface without methods
    class Student implements Serializable{
        public String name;
        Student(String name){
            this.name = name;
        }
    }


    public class MainSerializationObject {
        public static void main(String[] args) {
            String filename = "student.ser";
            Student originalStudent = new Student("Alice");

            try {
                // Step 1: Save the object to a file
                serializeStudent(originalStudent, filename);
                System.out.println("Serialization complete.");

                // Step 2: Load the object back from the file
                Student loadedStudent = deserializeStudent(filename);
                System.out.println("Deserialization complete. Result: " + loadedStudent);

            } catch (IOException | ClassNotFoundException e) {
                System.err.println("An error occurred during processing: " + e.getMessage());
                e.printStackTrace();
            }
        }

        /**
         * Converts a Student object into a stream of bytes and saves it to a file.
         */
        private static void serializeStudent(Student student, String filename) throws IOException {
            try (var fileOut = new FileOutputStream(filename);
                 var objectOut = new ObjectOutputStream(fileOut)) {

                objectOut.writeObject(student);
            }
        }

        /**
         * Reads a stream of bytes from a file and reconstructs it back into a Student object.
         */
        private static Student deserializeStudent(String filename) throws IOException, ClassNotFoundException {
            try (var fileIn = new FileInputStream(filename);
                 var objectIn = new ObjectInputStream(fileIn)) {

                return (Student) objectIn.readObject();
            }
        }
    }

