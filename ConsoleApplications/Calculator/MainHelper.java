package ConsoleApplications.Calculator;

import java.util.Scanner;

public class MainHelper
{
    private static double[] number = new double[3];

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

//    Input in array
    static double[] putInArray(int userInput2, Scanner s)
    {

        for (int i = 0; i <= 2; i++) {
            if (userInput2 == 1) {
                System.out.print("Enter the number " + (i + 1)+": ");
                number[i] = s.nextDouble();
                if (i == 1) {
                    break;
                }
            } else {
                System.out.print("Enter the number " + (i + 1)+":");
                number[i] = s.nextDouble();
            }
        }
        return number;
    }
//Call methods as needed

    static void dispResult(int userInput1,int userInput2,double[] number)
    {
        if (userInput1 == 1) {
            double result = 0;
            if (userInput2 == 1)
            {
                result = Calculator.add(number[0], number[1]);
            }
            else
            {
                result = Calculator.add(number[0], number[1],number[2]);
            }
            System.out.println(MainHelper.printWithoutDecimal(result));

        }
        else if (userInput1 == 2)
        {
            double result = 0;
            if (userInput2 == 1)
            {
                result = Calculator.subtract(number[0], number[1]);
            }
            else
            {
                result = Calculator.subtract(number[0], number[1],number[2]);
            }
            System.out.println(MainHelper.printWithoutDecimal(result));

        }
        else if (userInput1 == 3)
        {
            double result = 0;
            if (userInput2 == 1)
            {
                result = Calculator.multiply(number[0], number[1]);
            }
            else
            {
                result = Calculator.multiply(number[0], number[1],number[2]);
            }
            System.out.println(MainHelper.printWithoutDecimal(result));
        }
        else if (userInput1 == 4)
        {
            double result = 0;
            if (userInput2 == 1)
            {
                result = Calculator.divide(number[0], number[1]);
            }
            else
            {
                result = Calculator.divide(number[0], number[1],number[2]);
            }
            System.out.println(MainHelper.printWithoutDecimal(result));
        }
        else if (userInput1 == 5)
        {
            double result = 0;
            if (userInput2 == 1)
            {
                result = Calculator.power(number[0], number[1]);
            }
            else
            {
                result = Calculator.power(number[0], number[1],number[2]);
            }
            System.out.println(MainHelper.printWithoutDecimal(result));
        }
        else
        {
            System.out.println("Enter a Number between 1 to 6");
        }
    }


}
