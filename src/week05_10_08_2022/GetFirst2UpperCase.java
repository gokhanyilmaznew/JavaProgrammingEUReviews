package week05_10_08_2022;

import java.util.Scanner;
public class GetFirst2UpperCase {
/*
Task 1: Given a string, print the string made of its first two chars, so the String "Hello" yields “HE".
 */
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter a word"); //String word= "Hello",
                                //01234
    String word= scanner.next();//Hello
    String result=""+word.charAt(0)+word.charAt(1);
    String result2=word.charAt(0)+""+word.charAt(1);

    System.out.println(result.toUpperCase());
    System.out.println(result2.toUpperCase());



}

    public static class CalculatorWithSwitch {
        // we will create a basic calculator which has +, -, /, * with the switch case

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter first number");
            double number1= scanner.nextDouble();

            System.out.println("Please enter second number");
            double number2= scanner.nextDouble();

            System.out.println("Please enter your operator");
            char operator = scanner.next().charAt(0);
            //String operator=scanner.next();
            //we don't have nextChar() method so we need to use our String method which is charAt(0);
            double result = 0;

            switch (operator){
                case '+':
                    result=number1+number2;
                    break;
                case '-':
                    result=number1-number2;
                    break;
                case '/':
                    result=number1/number2;
                    break;
                case '*':
                    result=number1*number2;
                    break;
                default:
                    System.out.println("operator is wrong");
                    break;
        }
            System.out.println(result);
            scanner.close(); //it is not mandatory
    }



        }
}
