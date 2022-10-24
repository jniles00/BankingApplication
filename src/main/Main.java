package main;

import details.BankDetails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many customers to add? ");
        int noOfCustomers = scan.nextInt();

        BankDetails bankDetails[] = new BankDetails[noOfCustomers];

        for (int i = 0; i < bankDetails.length; i++) {
            bankDetails[i] = new BankDetails();
            bankDetails[i].openAccount();
        }

        int choice;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println( "1. Display all account details \n " +
                                "2. Search by Account number\n " +
                                "3. Deposit the amount \n " +
                                "4. Withdraw the amount \n" +
                                "5. Exit " +
                                "\n"
            );
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    for (int i = 0; i < bankDetails.length; i++) {
                        bankDetails[i].displayAccount();
                    }
                case 2:
                    System.out.println("Enter account number you want to search for: ");
                    String accNo = scan.next();

                    boolean isFound = false;

                    for (int i = 0; i < bankDetails.length; i++) {
                        isFound = bankDetails[i].searchAccNo(accNo);
                    }

                    if (isFound) {
                        break;
                    } else{
                        System.out.println("Search failed, Account number does not exist");
                    }

                case 3:

            }
        }while(choice != 5);
    }
}