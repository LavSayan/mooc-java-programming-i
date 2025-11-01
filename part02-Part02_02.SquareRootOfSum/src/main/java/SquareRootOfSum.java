
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        int number = num1 + num2;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
    }
}
