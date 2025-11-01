public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after stars 
    }

    public static void printSpaces(int number) {
        for (int space = 1; space <= number; space++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i); // Decreasing spaces
            printStars(i);         // Increasing stars
        }       
    }

    public static void christmasTree(int height) {
        // Print the tree layers
        for (int p = 1; p <= height; p++) {
            printSpaces(height - p); // Decreasing spaces
            printStars(2 * p - 1);   // Increasing stars (odd numbers: 1, 3, 5, ...)
        }

        // Print the tree trunk (base)
        for (int c = 1; c <= 2; c++) {
            printSpaces(height - 2); // Correct spacing to center the trunk
            printStars(3);            // Print 3 stars for the trunk
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}