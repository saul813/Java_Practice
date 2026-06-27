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

        Students.add("SS Saul");
        Students.add("Weaponz Saul");
        Students.add("Wpnz Saul");
        Students.add("Sab Saul");

        //Check the total number of items using .size()
        System.out.println("Total items: " + Students.size());

        //Remove an item using .remove(index)
        Students.remove(0);

        //Printing all elements in the ArrayList
        System.out.println("\n\n List Of Students");
        int i = 0;
        for(String student : Students){
            System.out.println((i+1)+ ". " + student);
            i++;
        }
    }
}
