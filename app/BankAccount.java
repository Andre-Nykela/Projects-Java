package app;

import entities.AccountRegistration;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountRegistration acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n) ? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new AccountRegistration(number, holder, initialDeposit);
        } else {
            acc = new AccountRegistration(number, holder);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(acc);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);

        System.out.println("Updated account value:");
        System.out.println(acc);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);

        System.out.println("Updated account value:");
        System.out.println(acc);

        sc.close();
    }

}
