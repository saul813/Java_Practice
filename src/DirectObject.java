public class DirectObject{
    public String Name;
    public String Id;
    //Constructor to initialize the attributes of the class
    public DirectObject(String Name, String Id){
        this.Name = Name;
        this.Id = Id;
    }
    //Setter Method to set the attributes of the class
    public void setName(String Name){
        this.Name = Name;
    }
    public void setId(String Id){
        this.Id = Id;
    }
    //Getters to get the values of the attributes of the class
    public String getName(){
        return Name;
    }
    public String getId(){
        return Id;
    }

    public static void main(String[] args) {
        DirectObject ds = new DirectObject("Saul","1");
        System.out.println("Name: "+ ds.getName() +" Id: "+ ds.getId());
    }
}
