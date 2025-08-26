package com.example.userregistration;

public class UserRegistration {

	public boolean validateFirstName(String firstName) throws InvalidUserDetailException {
        if (firstName == null || !firstName.matches("^[A-Z][a-z]{2,}$"))
            throw new InvalidUserDetailException("Invalid First Name");
        return true;
    }
	
	public boolean validateLastName(String lastName) throws InvalidUserDetailException {
        if (lastName == null || !lastName.matches("^[A-Z][a-z]{2,}$"))
            throw new InvalidUserDetailException("Invalid Last Name");
        return true;
    }
}
