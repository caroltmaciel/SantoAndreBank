package br.com.caroltmaciel.santoandre.app;

import br.com.caroltmaciel.santoandre.service.AccountService;
import br.com.caroltmaciel.santoandre.entities.Account;

public class Program {

    public static void main(String[] args) {
        String userId = "carol";

        AccountService accountService = new AccountService();
        Account account = accountService.getAccount(userId);
    }
}
