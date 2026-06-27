import java.sql.SQLOutput;

class CourseArrayList {
    public int[] data ; //Underlying array to store data
    public int size;  // Current actual number of elements in our list.
    public int capacity; // Available slots

    public CourseArrayList(){
        this.capacity = 4;
        this.data = new int[capacity];
        this.size = 0;
    }

    //Adding an element to the array
    public void addElement(int element){
        if(size == capacity){
            resizeCourse();
        }
        data[size] = element;
        size++;
    }

    //Resizing the Course to increase the capacity
    public void resizeCourse() {
        //Doubling the capacity of the course
        capacity *= 2;

        //Creating a new array to take up the current capacity
        int newData[] = new int[capacity];

        //Copying elements of the old array to the new array
        for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        //Replacing the old array with the new array
        data = newData;
        System.out.println("The Course is full and it's Capacity has been increased to "+ capacity);
    }

    //Get an element at a particular index
    public int getElement(int index){
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    //
}
public class CustomArrayList {
    public static void main(String[] args) {
        CourseArrayList ca = new CourseArrayList();
        ca.addElement(1);
        int returnedElement0 = ca.getElement(0);
        System.out.println("Returned Element is "+returnedElement0);
        ca.addElement(2);
        int returnedElement1 = ca.getElement(1);
        System.out.println("Returned Element is "+returnedElement1);
        ca.addElement(3);
        int returnedElement2 = ca.getElement(2);
        System.out.println("Returned Element is "+returnedElement2);
        ca.addElement(4);
        int returnedElement3 = ca.getElement(3);
        System.out.println("Returned Element is "+returnedElement3);
        ca.addElement(5);
        int returnedElement4 = ca.getElement(4);
        System.out.println("Returned Element is "+returnedElement4);
    }
}
