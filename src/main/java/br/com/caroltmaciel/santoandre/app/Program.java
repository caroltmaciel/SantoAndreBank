package br.com.caroltmaciel.santoandre.app;

import java.util.Scanner;

import br.com.caroltmaciel.santoandre.entities.User;
import br.com.caroltmaciel.santoandre.format.MoneyFormatter;
import br.com.caroltmaciel.santoandre.service.AccountService;
import br.com.caroltmaciel.santoandre.entities.Account;
import br.com.caroltmaciel.santoandre.service.UserService;

public class Program {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        MoneyFormatter format = new MoneyFormatter();

        UserService userService = new UserService();
        User user = userService.create("John", "MacAndCheese", "XXX.XXX.XXX", "johnmacandcheese@xxxxx.com");

        System.out.println("Client: " + user.getFirstName() + " " + user.getLastName() + " | ID: " + user.getId());

        AccountService accountService = new AccountService();
        Account account = accountService.getAccount(user);
        System.out.println("Account ID: " + account.getId());

        System.out.println("Balance: " + format.formatCurrency(account.getBalance()));

        System.out.print("How much do you want to deposit? ");
        double deposit = leitor.nextDouble();
        accountService.deposit(account, deposit);
        System.out.println("Completed successfully deposit of: " + format.formatCurrency(deposit));
        System.out.println("Balance: " + format.formatCurrency(account.getBalance()));

        System.out.print("How much would you like to withdraw? ");
        double withdraw = leitor.nextDouble();
        accountService.withdraw(account, withdraw);
        System.out.println("Completed successfully withdraw of: " + format.formatCurrency(withdraw));
        System.out.println("Balance: " + format.formatCurrency(account.getBalance()));

        leitor.close();
    }
}