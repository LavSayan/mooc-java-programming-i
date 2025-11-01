
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int rep = 1  ; rep <= number ; rep++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int column = 1 ; column <= size ; column++ ) {
            for (int row = 1 ; row <= size ; row++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        for (int row = 1 ; row <= height ; row++ ) {
            for (int column = 1 ; column <= width ; column++) {
                System.out.print("*");
            }
            System.out.println("");   
        }
    }

    public static void printTriangle(int size) {
        int i = size;
        for (int p = 1 ; p <= i ; p++) {
            for (int o = 1 ; o <= p ; o++) {
                System.out.print("*");   
            }
            System.out.println("");   
        }  
    }
}
