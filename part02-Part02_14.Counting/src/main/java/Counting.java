
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 0;
        int input = Integer.valueOf(scanner.nextInt());
        
        for (int i = start ; i <= input ; i++) {
            System.out.println(i);
        }
        scanner.close();

    }
}
