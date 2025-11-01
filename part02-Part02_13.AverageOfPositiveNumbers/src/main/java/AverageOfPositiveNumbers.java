
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numsOfNum = 0;
        
        while (true) { 

            // asks the user for input
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            //calculates the sum of the inputted values
            if (num > 0) {
                sum = num + sum;
            }

            //reading how many num are inputted
            if (num > 0) {
                numsOfNum = numsOfNum + 1;   
            }

            //once they inputted 0, it will stop 
            if (num == 0) {
                break;
            }
        }


        if (numsOfNum > 0) {
            //calcutes the average of the sum and the amount of num
            double average = 1.0 * sum / numsOfNum;

            //prints the total average
            System.out.println("Average of the numbers: " + average);  
        } else {
            System.out.println("Cannot calculate the average");
        }
       
    }
}
