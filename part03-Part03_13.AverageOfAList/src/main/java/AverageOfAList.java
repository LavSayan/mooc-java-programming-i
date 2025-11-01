
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOfInputs = 0;
        double sum = 0;
        
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        for (double input: list) {
            sum = sum + input;
            numOfInputs = numOfInputs + 1;
        }


        System.out.println("Average: " + (sum/numOfInputs));
    }
}
