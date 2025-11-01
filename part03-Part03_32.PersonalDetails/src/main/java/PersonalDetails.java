
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumBirthYear = 0;
        int numOfInput = 0;
        double averageBirthYears = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] inputs = input.split(",");
            String name = inputs[0];
            int birthYear = Integer.valueOf(inputs[1]);

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            sumBirthYear = sumBirthYear + birthYear;
            numOfInput = numOfInput + 1;
        } 

        averageBirthYears = 1.0 * sumBirthYear/numOfInput;

        System.out.println("Longest name: " + longestName + " Average of the birth years: " + averageBirthYears);
    }
}
