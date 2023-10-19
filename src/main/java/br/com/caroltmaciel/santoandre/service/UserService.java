package br.com.caroltmaciel.santoandre.service;

import br.com.caroltmaciel.santoandre.entities.User;

import java.util.UUID;

public class UserService {

    public User create(String firstName, String lastName, String taxNumber, String email) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setTaxNumber(taxNumber);
        user.setId(UUID.randomUUID().toString());
        user.setEmail(email);
        return user;
    }

    public void find(String id) {

    }

    public void update() {

    }

    public void delete(String id) {

    }

}
