
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int values = 0;
        int sum = 0;

        while (true) { 
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0 || num < 0) {   
                values = values + 1;
                sum = num + sum;
            }


        }
        System.out.println("Number of numbers: " + values);
        System.out.println("Sum of the numbers: " + sum);

    }
}
