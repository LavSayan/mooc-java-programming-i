import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            String numOfPage = scanner.nextLine();

            System.out.println("Publication year: ");
            String publicationYr = scanner.nextLine();

            infoCollection.add(new Book(numOfPage, publicationYr, title));
        }


        System.out.println("What information will be printed: ");
        String infoToBePrint = scanner.nextLine();

        if (infoToBePrint.equals("everything")) {
            for (Book info: infoCollection) {
                System.out.println(info.printEvething());
            }
        }

        if (infoToBePrint.equals("name")) {
            for (Book info: infoCollection) {
                System.out.println(info.getTitle());
            }
        }
        


        

    }
}
