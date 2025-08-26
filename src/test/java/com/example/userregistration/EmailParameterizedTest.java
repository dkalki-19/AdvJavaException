package com.example.userregistration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EmailParameterizedTest {

    private String email;
    private boolean expected;
    private UserRegistration user = new UserRegistration();

    public EmailParameterizedTest(String email, boolean expected) {
        this.email = email;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> emails() {
        return Arrays.asList(new Object[][]{
            {"abc@bl.co", true},
            {"abc.xyz@bl.co.in", true},
            {"abc@.com", false}
        });
    }

    @Test
    public void testEmails() throws Exception {
        assertEquals(expected, user.validateEmail(email));
    }
}

