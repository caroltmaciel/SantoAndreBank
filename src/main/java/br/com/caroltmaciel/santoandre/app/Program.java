package br.com.caroltmaciel.santoandre.app;

import java.util.Scanner;

import br.com.caroltmaciel.santoandre.format.MoneyFormatter;
import br.com.caroltmaciel.santoandre.service.AccountService;
import br.com.caroltmaciel.santoandre.entities.Account;

public class Program {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        MoneyFormatter format = new MoneyFormatter();

        String userId = "carol";

        AccountService accountService = new AccountService();
        Account account = accountService.getAccount(userId);

        System.out.println("Balance: " + format.formatEuro(account.getBalance()));

        System.out.print("How much do you want to deposit? ");
        double deposit = leitor.nextDouble();
        accountService.deposit(account, deposit);
        System.out.println("Completed successfully deposit of: " + format.formatEuro(deposit));
        System.out.println("Balance: " + format.formatEuro(account.getBalance()));

        System.out.print("How much would you like to withdraw? ");
        double withdraw = leitor.nextDouble();
        accountService.withdraw(account, withdraw);
        System.out.println("Completed successfully withdraw of: " + format.formatEuro(withdraw));
        System.out.println("Balance: " + format.formatEuro(account.getBalance()));

        leitor.close();
    }
}