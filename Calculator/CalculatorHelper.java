package Assignment.Calculator;

import java.util.Scanner;

public class CalculatorHelper
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println(" Hello Im Calculator....\n I can do the following operations");
            System.out.print(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Power \n 6.Exit\n Enter the Operation(number): ");
            int userInput1 = s.nextInt();
        if(userInput1==0 || userInput1>6)
        {
            System.out.println("Enter number between 1 and 6");
            continue;
        }
            System.out.print(" 1.Two Number Operation\n 2.Three Number Operation\n Enter the Operation(number): ");
            int userInput2 = s.nextInt();
            if(userInput2!=1 || userInput2!=2)
            {
                System.out.println("Enter either 1 or 2");
                continue;
            }
                double[] number = new double[3];
//          Getting user input and Storing it in array

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


//          Calling methods as needed


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
                    System.out.println(Calculator.printWithoutDecimal(result));

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
                    System.out.println(Calculator.printWithoutDecimal(result));

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
                    System.out.println(Calculator.printWithoutDecimal(result));
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
                    System.out.println(Calculator.printWithoutDecimal(result));
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
                    System.out.println(Calculator.printWithoutDecimal(result));
                }
                else if (userInput1 == 6)
                {
                    break;
                }
                else
                {
                    System.out.println("Enter a Number between 1 to 6");
                }








        } //while close
    }//main close
}//class close
