
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nosOfInput = 0;
        int nosOfEvenNos = 0;
        int nosOfOddNos = 0;

        System.out.println("Give numbers:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input < -1 || input > -1) {
                sum += input;
            }

            if (input < -1 || input > -1) {
                nosOfInput++;
            }

            if (input % 2 == 0) {
                nosOfEvenNos += 1;
            } else {
                nosOfOddNos += 1;
            }
        }

        double average = 1.0 * sum / nosOfInput;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + nosOfInput);
        System.out.println("Average: " + average);
        System.out.println("Even: " + nosOfEvenNos);
        System.out.println("Odd: " + nosOfOddNos);

    }
}
