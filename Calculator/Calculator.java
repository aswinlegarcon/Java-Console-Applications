package Assignment.Calculator;

public class Calculator {


//    Addition
    static double add(double a , double b)
    {
        return a+b;
    }
    static double add(double a , double b, double c)
    {
        return a+b+c;
    }


//    Subtraction
    static double subtract(double a , double b)
    {
        return a-b;
    }
    static double subtract(double a , double b, double c)
    {
        return a-b-c;
    }


//  Multiplication
    static double multiply(double a , double b)
    {
        return a*b;
    }
    static double multiply(double a , double b, double c)
    {
        return a*b*c;
    }


//    Division
    static double divide(double a , double b)
    {
        try{
            return a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        return 0;
    }
    static double divide(double a , double b, double c)
    {
            try{
                return a/b/c;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Error : "+e.getMessage());
            }
        return 0;
    }

//    Power

    static double power(double a , double b)
    {
        return Math.pow(a,b);
    }
    static double power(double a , double b, double c)
    {
        return Math.pow(Math.pow(a,b),c);
    }

//    Print without decimal
    static Number printWithoutDecimal(double x)
    {
        if(x % 2 != 0)
        {
            return x;
        }
        else
            return (long)x;

    }

}
