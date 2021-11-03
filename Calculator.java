public class Calculator {
    private double result;

    //adding method
    public double add (double x, double y){
        result = x + y;
        return result;
    }

    //subtracting method
    public double subtract (double x, double y){
        result = x-y;
        return result;
    }

    //multiplying method
    public double multiply (double x, double y){
        result = x * y;
        return result;
    }

    //dividing method
    public double divide (double x, double y){
        result = x/y;
        return result;
    }

    //squaring method
    public double square (double x){
        result = x * x;
        return result;
    }
    
}
