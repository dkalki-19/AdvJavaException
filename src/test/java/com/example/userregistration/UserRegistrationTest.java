package com.example.userregistration;

import org.junit.Test;
import static org.junit.Assert.*;
public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
	    UserRegistration user = new UserRegistration();
	    assertTrue(user.validateFirstName("John"));
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
	    UserRegistration user = new UserRegistration();
	    assertFalse(user.validateFirstName("Jo"));
	}

}
