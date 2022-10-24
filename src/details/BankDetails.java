package details;

import java.util.Scanner;

public class BankDetails {

    private String accountNo;
    private String account_type;
    private String name;
    private long balance;

    Scanner scan = new Scanner(System.in);

    public void openAccount(){

        System.out.println("Please enter Account Number: ");
        accountNo = scan.next();

        System.out.println("Please enter Account type: ");
        account_type = scan.next();

        System.out.println("Please enter Name: ");
        name = scan.next();

        System.out.println("Please enter Balance: ");
        balance = scan.nextLong();
    }

    public void displayAccount(){
        System.out.println("Name of Account holder: " + name);
        System.out.println("Account number: " + account_type);
        System.out.println("Account type: " + account_type);
        System.out.println("Current balance: " + balance);
    }

    public void withdrawal(){
        long amount;

        System.out.println("Enter amount to withdraw: ");
        amount = scan.nextLong();

        if(balance >= amount){
            balance -= amount;

            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Balance after withdrawal: " + balance);
        } else{
            System.out.println("Balance less than " + amount + "\tTransaction failed!");
        }
    }

    public boolean searchAccNo(String account_No){
        if(accountNo.equals(account_No)){
            showAccount();
            return true;
        }

        return false;
    }

    public void showAccount() {
        System.out.println(
                "Name of account holder: " + name +
                "Account number: " + accountNo +
                "Account type: " + account_type +
                "Balance: " + balance
        );
    }

    // Method to deposit money
    public void deposit(){
        long amount;

        System.out.println("Enter amount to deposit: ");
        amount = scan.nextLong();

        balance = balance + amount;
    }
}