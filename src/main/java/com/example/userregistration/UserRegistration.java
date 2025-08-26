package com.example.userregistration;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-z]{2,}$");
    }
}
