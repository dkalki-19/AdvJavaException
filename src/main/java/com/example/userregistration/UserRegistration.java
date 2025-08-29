package com.example.userregistration;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidation {
    boolean validate(String input) throws InvalidUserDetailException;
}

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

    public boolean validateEmail(String email) throws InvalidUserDetailException {
        if (email == null || !email.matches("^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2,})?$"))
            throw new InvalidUserDetailException("Invalid Email");
        return true;
    }
    
    public boolean validateMobile(String mobile) throws InvalidUserDetailException {
        if (mobile == null || !mobile.matches("^[0-9]{2} [0-9]{10}$"))
            throw new InvalidUserDetailException("Invalid Mobile");
        return true;
    }

    public boolean validatePassword(String password) throws InvalidUserDetailException {
        if (password == null || !password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$"))
            throw new InvalidUserDetailException("Invalid Password");
        return true;
    }

}
