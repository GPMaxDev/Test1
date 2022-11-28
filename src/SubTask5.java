import java.util.Scanner;

public class SubTask5 {
    public static void main(String[] args) {

        int number;

        if(args != null && args.length == 1) {

            number = Integer.parseInt(args[0].trim());

            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println("Введите положительное число");
            }
        }
        else
        {
            System.out.println("Вы не ввели число. Введите число");
        }

    }
}
