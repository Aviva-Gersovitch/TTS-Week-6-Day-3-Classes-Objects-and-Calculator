public class App {

    public static void main(String[] args) throws Exception {
        //Java Calculator
        //Calls Calculator class and instantiates new calculator object
        Calculator calculate = new Calculator();

        final double NUM1 = 6;
        final double NUM2 = 5;

        System.out.println(calculate.add(NUM1, NUM2));
        System.out.println(calculate.subtract(NUM1, NUM2));
        System.out.println(calculate.multiply(NUM1, NUM2));
        System.out.println(calculate.divide(NUM1, NUM2));
        System.out.println(calculate.square(NUM1));

        //Magic Calculator
        //Calls Magic Calculator class instantiated new magic calculator object
        MagicCalculator magicC = new MagicCalculator();

        System.out.println(magicC.squareRoot(NUM1));
        System.out.println(magicC.sine(NUM1));
        System.out.println(magicC.cosine(NUM1));
        System.out.println(magicC.tangent(NUM1));
        System.out.println(MagicCalculator.factorial(NUM1));   //accessed in static way calling class name instead of new instance based on https://www.intertech.com/a-static-method-should-be-accessed-in-a-static-way/


        //Classes & Objects Homework
        //1. Pet class
        // Calls Pet class and instantiates new pet object
        Pet pet1 = new Pet("Fifi", 5, "Paris", "Bichon Frise");

        String pet1Name = pet1.getName();
        System.out.println("pet1's name is: " + pet1Name);

        int pet1Age = pet1.getAge();
        System.out.println("pet1's age is: " + pet1Age);

        String pet1Type = pet1.getType();
        System.out.println("pet1's type is: " + pet1Type);

        //New Pet object to use setter method
        Pet pet2 = new Pet();   //creates without values

        //calls set methods
        pet2.setName("Rags");
        pet2.setAge(9);
        pet2.setLocation("Doghouse");

        //calls get methods and outputs newly set values
        String pet2Name = pet2.getName();
        System.out.println("pet2's name is: " + pet2Name);

        int pet2Age = pet2.getAge();
        System.out.println("pet2's age is: " + pet2Age);


        String pet2Location = pet2.getLoc();
        System.out.println("pet2's location is: " + pet2Location);


        //2. Custom snowman class
        Snowman frosty = new Snowman();

        //calls set methods
        frosty.setName("Frosty");
        frosty.setNumLayers(3);
        frosty.setIfMelted(false);

        //calls get methods and outputs newly set values
        String frostyName = frosty.getName();
        System.out.println("frosty's name is: " + frostyName);
        int layerNum = frosty.getNumLayers();
        System.out.println("frosty has: " + layerNum + " layers.");
        boolean isMelted = frosty.checkIfMelted();
        System.out.println("Has frosty melted? " + isMelted + " Still frosty!");

        //calls boolean and string methods
        System.out.println(frosty.isFrosty());
        System.out.println(frosty.doYouWanttoBuildASnowman());
    }
}
