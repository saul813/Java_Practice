public class MainCloneObject implements Cloneable{
    public String Name = "Clone Method";
    //Override the clone() method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try{
            MainCloneObject mco1 = new MainCloneObject();
            MainCloneObject mco2 = (MainCloneObject) mco1.clone();
            System.out.println(mco2.Name);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
