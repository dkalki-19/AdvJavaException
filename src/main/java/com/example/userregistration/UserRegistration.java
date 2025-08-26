package com.example.userregistration;

public class UserRegistration {

	public boolean validateFirstName(String firstName) throws InvalidUserDetailException {
        if (firstName == null || !firstName.matches("^[A-Z][a-z]{2,}$"))
            throw new InvalidUserDetailException("Invalid First Name");
        return true;
    }
}
