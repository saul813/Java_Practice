class ReflectionObject {
    public ReflectionObject() {}
}
public class MainReflectionObject {
    public static void main( String[] args){
        try{
            Class <?> c = Class.forName("ReflectionObject");
            ReflectionObject ro = (ReflectionObject) c.getDeclaredConstructor().newInstance();
            System.out.println(ro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

