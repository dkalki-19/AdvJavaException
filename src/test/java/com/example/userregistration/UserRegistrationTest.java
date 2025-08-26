package com.example.userregistration;

import org.junit.Test;
import static org.junit.Assert.*;
public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
	    UserRegistration user = new UserRegistration();
	    try {
			assertTrue(user.validateFirstName("John"));
		} catch (InvalidUserDetailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
	    UserRegistration user = new UserRegistration();
	    try {
			assertFalse(user.validateFirstName("Jo"));
		} catch (InvalidUserDetailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
