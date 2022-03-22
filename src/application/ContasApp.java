package application;


import entities.Account;

import java.util.Scanner;

public class ContasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter number cont: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account holder name: ");
        String nome = sc.nextLine();

        System.out.println("Is there na initial deposit value: (Y/N) ");
        char ler = sc.next().charAt(0);

        if (ler != 'n') {
            System.out.println("Initial amount to create the accountt: ");
            double valor = sc.nextInt();
            account = new Account(numeroDaConta, nome, valor);
        } else {
            System.out.println("Conta criada!! ");
            account = new Account(numeroDaConta, nome);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Update account data: ");
        System.out.println(account);


        sc.close();
    }
}
