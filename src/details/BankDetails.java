package details;

import java.util.Scanner;

public class BankDetails {

    private String accountNo;
    private String name;
    private String account_type;
    private long balance;

    Scanner scan = new Scanner(System.in);

    public void openAccount(){

        System.out.println("Please enter Account Number: ");
        accountNo = scan.next();
    }
}
