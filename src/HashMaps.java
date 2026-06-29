import java.util.Map;
import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args) {
        //Declaring a hash map called Student to Store students and their marks
        Map<String, Integer> Student = new HashMap<>(10);
        //Adding the first student to the hashmap
        Student.put("Sabunyo", 68);
        //Retrieving the Student that was stored in the hashmap
        for (Map.Entry< String, Integer> std : Student.entrySet()){
            String key = std.getKey();
            Integer value =std.getValue();
            System.out.println("The Marks of "+ key + " are "+ value);
        }
    }
}
