package bankingsystem;

import java.util.Scanner;

public class bankingsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 50000.00;
        int choice;

        do {
            System.out.println("\n SIMPLE BANKING SYSTEM ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: N" + balance);

            } else if (choice == 2) {
                System.out.print("Enter deposit amount: N");
                double deposit = input.nextDouble();

                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposit successful!");
                    System.out.println("Your new balance is: N" + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }

            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: N");
                double withdrawal = input.nextDouble();

                if (withdrawal <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                } else if (withdrawal > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    balance -= withdrawal;
                    System.out.println("Withdrawal successful!");
                    System.out.println("Your new balance is: N" + balance);
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using my banking system.");

            } else {
                System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        input.close();
    }
}