package com.example.userregistration;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-z]{2,}$");
    }
    
    public boolean validateLastName(String lastName) {
        return lastName.matches("^[A-Z][a-z]{2,}$");
    }
	
	public boolean validateLastName(String lastName) throws InvalidUserDetailException {
        if (lastName == null || !lastName.matches("^[A-Z][a-z]{2,}$"))
            throw new InvalidUserDetailException("Invalid Last Name");
        return true;
    }
}
