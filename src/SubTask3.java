import java.util.Scanner;

public class SubTask3 {
    public static void main(String[] args) {
         int denominator;
         int maxDenominator;

         if(args != null && args.length == 2)
         {
             int firstNumber = Integer.parseInt(args[0]);
             denominator = firstNumber;
             int secondNumber = Integer.parseInt(args[1]);

             if (firstNumber > secondNumber) {
                 denominator = secondNumber;
             }

             while (denominator > 0) {
                 if (firstNumber % denominator == 0 && secondNumber % denominator == 0) {
                     maxDenominator = denominator;
                     System.out.printf("Наибольший общий делитель числа %d и числа %2d это число %-33d \n",
                             firstNumber, secondNumber, maxDenominator);
                     break;
                 }
                 denominator--;
             }
         }
         else {
             System.out.println("Введите два числа: ");
         }

    }
}
