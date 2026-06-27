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
            throw new ArrayIndexOutOfBoundsException("The Course is full");
        }
        data[size] = element;
        size++;
    }

    //
}
public class CustomArrayList {
}
