
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        Account zyannAccount = new Account ("Zyann's account", 100.0);
        
        System.out.println("Initial state:");
        System.out.println(zyannAccount);

        zyannAccount.deposit(20.0);

        System.out.println("End state:");
        System.out.println(zyannAccount);

    }
}
