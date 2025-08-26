package com.example.userregistration;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-z]{2,}$");
    }
    
    public boolean validateLastName(String lastName) {
        return lastName.matches("^[A-Z][a-z]{2,}$");
    }
	
    public boolean validateEmail(String email) {
        return email.matches("^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2,})?$");
    }
    
    public boolean validateMobile(String mobile) {
        return mobile.matches("^[0-9]{2} [0-9]{10}$");
    }
}
