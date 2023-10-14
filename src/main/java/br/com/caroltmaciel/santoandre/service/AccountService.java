package br.com.caroltmaciel.santoandre.service;

import br.com.caroltmaciel.santoandre.entities.Account;
import br.com.caroltmaciel.santoandre.entities.User;

public class AccountService {

    public Account getAccount(String userId) {
        User userMock = new User();
        userMock.setId(userId);

        Account accountMock = new Account();
        accountMock.setUser(userMock);
        accountMock.setBalance(0.0);
        accountMock.setId("123");

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