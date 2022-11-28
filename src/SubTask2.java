import java.util.Scanner;

public class SubTask2 {
    public static void main(String[] args) {

        if (args.length > 0)
        {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string : args){
                stringBuilder.append(string.trim());
                stringBuilder.append(" ");
            }
            System.out.println(stringBuilder.toString().trim());
        }
        else
        {
            System.out.println("Введите строки");
        }
    }
}

