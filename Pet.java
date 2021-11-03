public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    //constructor no-arg
    public Pet(){

    }

    //constructor with all args
    public Pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;

    }

    //get method for name
    public String getName(){
        return name;
    }

    //get method for age
    public int getAge(){
        return age;
    }

    //get method for location
    public String getLoc(){
        return location;
    }

    //get method for type
    public String getType(){
        return type;
    }

    //set method for name
    public void setName(String newName){
        name = newName;
    }

    //set method for age
    public void setAge(int newAge){
        age = newAge;
    }

    //set method for location
    public void setLocation(String newLoc){
        location = newLoc;
    }
}


