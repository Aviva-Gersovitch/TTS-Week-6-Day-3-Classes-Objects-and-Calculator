public class Snowman {
    private String name;
    private int layers;
    private boolean isMelted;

    //constructor no-arg
    public Snowman(){

    }

    //constructor with 2 parameters
    public Snowman(String name, int layers){

    }

    //constructor using all instance variables
    public Snowman(String name, int layers, boolean isMelted){

    }

    //get method for name
    public String getName(){
        return name;
    }

    //get method for layers
    public int getNumLayers(){
        return layers;
    }

    //get method for isMelted
    public boolean checkIfMelted(){
        return isMelted;
    }

    //set method for name
    public void setName(String newName){
        name = newName;
    }

    //set method for layers
    public void setNumLayers(int layerNum){
        layers = layerNum;
    }

    //set method for isMelted
    public void setIfMelted(boolean value){
        isMelted = value;
    }

    //method that returns boolean
    public boolean isFrosty(){
        return true;
    }

    //method that returns string
    public String doYouWanttoBuildASnowman(){
        return "Come on, let's go and play!";
    }
}
