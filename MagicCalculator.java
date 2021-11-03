import java.lang.Math;
public class MagicCalculator extends Calculator {
    private double result;

    //square root method
    public double squareRoot(double x){
        result = Math.sqrt(x);
        return result;
    }

    //sine method
    public double sine(double x){
        result = Math.sin(x);
        return result;
    }

    //cosine method
    public double cosine(double x){
        result = Math.cos(x);
        return result;
    }

    //tangent method
    public double tangent(double x){
        result = Math.tan(x);
        return result;
    }

    //factorial method using recursion
    static double factorial(double n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));    
       }   
}
