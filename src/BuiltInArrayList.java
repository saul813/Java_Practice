import java.util.*;
public class BuiltInArrayList {
    public static void main(String[] args){

        //Creating the ArrayList
        ArrayList<String> Students = new ArrayList<>();

        //Adding an Element to the ArrayList
        Students.add("Sabunyo Saul");

        //Getting an Element from the arrayList
        String elementInList = Students.get(0);
        System.out.println("Element added " + elementInList);

        //Updating an Element in the List
        Students.set(0, "Masaba Daniel");
        String updatedElement = Students.get(0);
        System.out.println("Element Updated to " + updatedElement);
    }
}
