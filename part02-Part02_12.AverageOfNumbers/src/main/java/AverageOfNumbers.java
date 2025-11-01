
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int values = 0;

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

        double average = 1.0 * sum / values;
        System.out.println("Average of the numbers: " + average);

    }
}
