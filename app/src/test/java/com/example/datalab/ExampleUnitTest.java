package com.example.datalab;

import com.example.datalab.authenticate.Account;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    // Testing Account methods
    @Test
    public void testAccountConstructor() {
        Account a = new Account("preston1@uw.edu", "test1@3");
        assertNotNull(a);
    }

    @Test
    public void testAccountConstructorBadEmail() {
        try {
            Account acc = new Account("preston1uw.edu", "test1@3");
            boolean n = acc.isValidEmail(acc.getEmail());
            assertFalse(n);

            //fail("Account created with invalid email");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAccountConstructorBadPassword() {
        try {
            Account acc = new Account("preston1@uw.edu", "abcde");
            boolean n = acc.isValidPassword(acc.getPassword());
            assertFalse(n);
        } catch (IllegalArgumentException e) {
        }
    }
    // Instructions ask for more tests to be made. I corrected 1 and added another like it. This may be enough, maybe not







}