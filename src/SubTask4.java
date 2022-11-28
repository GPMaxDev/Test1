import java.util.Scanner;

public class SubTask4 {
    public static void main(String[] args) {

        int firstNumber;

        if(args != null && args.length == 1)
        {
            firstNumber = Integer.parseInt(args[0]);
            System.out.printf("Сумма разрядов числа %d равна %2d \n",firstNumber, summOfNumberDigits(firstNumber));
        }
        else
        {
            System.out.println("Вы не ввели число. Введите число ");
        }

    }

    public static int summOfNumberDigits(int num){

        if (num < 10)
        {
            return num;
        }
        int digit = num % 10;
        int nextNum = num / 10;

        return digit + summOfNumberDigits(nextNum);
    }

}
