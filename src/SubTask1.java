import java.util.Scanner;

public class SubTask1 {

    public static void main(String[] args)  {

        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);
        double resultOfNumbers = firstNumber + secondNumber;

        System.out.printf("%-6.1f \n",resultOfNumbers);
    }

}
