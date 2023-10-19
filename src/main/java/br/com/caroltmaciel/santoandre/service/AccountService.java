package br.com.caroltmaciel.santoandre.service;

import br.com.caroltmaciel.santoandre.entities.Account;
import br.com.caroltmaciel.santoandre.entities.User;

import java.util.UUID;

public class AccountService {

    public Account getAccount(User user) {

        Account accountMock = new Account();
        accountMock.setUser(user);
        accountMock.setBalance(0.0);
        accountMock.setId(UUID.randomUUID().toString());

        return accountMock;
    }

    public void withdraw(Account account, Double quantity) {
        Double balanceUpdate = account.getBalance() - quantity;
        account.setBalance(balanceUpdate);
    }

    public void deposit(Account account, Double quantity) {
        Double balanceUpdate = account.getBalance() + quantity;
        account.setBalance(balanceUpdate);
    }

}