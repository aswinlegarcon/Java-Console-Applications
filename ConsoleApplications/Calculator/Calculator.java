package ConsoleApplications.Calculator;


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

// For all expression

    static double evaluation(String userInput)
    {
        double result = 0;
        char currentOperator ='+';

        StringBuilder expression = new StringBuilder(); // for creating mutable strings

        for (int i=0; i < userInput.length();i++)
        {
            char currentChar = userInput.charAt(i);

            if(Character.isDigit(currentChar) || currentChar=='.')
            {
                expression.append(currentChar);
            }
            else if(currentChar=='+' || currentChar =='-'|| currentChar=='*'||currentChar=='/'||currentChar=='^') {
                if (!expression.isEmpty())
                {
                    double currentNum = Double.parseDouble(expression.toString()); //changing string into double for calculation

                    if (result == 0)
                    {
                        result = currentNum;
                    }
                    else
                    {
                        switch (currentOperator)
                        {
                            case '+':
                                result = result + currentNum;
                                break;
                            case '-':
                                result = result - currentNum;
                                break;
                            case '*':
                                result = result * currentNum;
                                break;
                            case '/':
                                result = result / currentNum;
                                break;
                            case '^':
                                result = Math.pow(result, currentNum);
                                break;
                            default:
                                System.out.println("Some kind of error occured in operators....enter correct operator");
                        }

                    }
                    expression = new StringBuilder();
                    currentOperator = currentChar;
                }
            }//if end

        }//for end


        if(!expression.isEmpty())//for handling the last number available in (expression) as the loop terminates based on the length
        {
            double currentNum = Double.parseDouble(expression.toString());
            switch (currentOperator)
            {
                case '+':
                    result = result+currentNum;
                    break;
                case '-':
                    result = result-currentNum;
                    break;
                case '*':
                    result = result*currentNum;
                    break;
                case '/':
                    result = result/currentNum;
                    break;
                case '^':
                    result = Math.pow(result,currentNum);
                    break;
                default:
                    System.out.println("Some kind of error occured in operators....enter correct operator(in second switch)");
            }
        }
    return result;
    }


}
