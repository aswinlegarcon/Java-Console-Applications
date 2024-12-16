package ConsoleApplications.Calculator;

import java.util.Scanner;


    public class CalculatorHelper
    {
        public static void runCalcuator()
        {
            Scanner s = new Scanner(System.in);
            while(true) {
                System.out.println(" Hello Im Calculator....\n I can do the following operations");
                System.out.print(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Power \n 6.Evaluation\n 7.Exit\n Enter the Operation(number): ");
                int userInput1 = s.nextInt();
                if(userInput1==0 || userInput1>7)
                {
                    System.out.println("Enter number between 1 and 7");
                    continue;
                }
                if (userInput1 == 7)
                {
                    break;
                }

                if(userInput1==6)
                {
                    s.nextLine();
                    System.out.print(" Enter the Operation as expression(eg: 10+20-30*10): ");
                    String userInputString = s.nextLine();
                    System.out.println(MainHelper.printWithoutDecimal(Calculator.evaluation(userInputString)));
                }
                else
                {
                    System.out.print(" 1.Two Number Operation\n 2.Three Number Operation\n Enter the Operation(number): ");
                    int userInput2 = s.nextInt();
                    if(userInput2==0 || userInput2>2)
                    {
                        System.out.println("Enter either 1 or 2");
                        continue;
                    }
                    double[] number = new double[3];
//          Getting user input and Storing it in array

                    number = MainHelper.putInArray(userInput2,s);


//          Calling methods as needed
                    MainHelper.dispResult(userInput1,userInput2,number);
                }


            } //while close
        }//main close
    }//class close


