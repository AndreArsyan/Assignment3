package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.assignment3.*;

public class TestEmailGenerator {

    @Test
    public void testHeader() {
        EmailGenerator emailGenerator = new EmailGenerator();
        Email email;
        email = emailGenerator.GenerateChristmasEmail("vip");
        assertEquals("We hope this email finds you and your family well.", email.GetHeader());
    }

    @Test
    public void testGreetings() {
        EmailGenerator emailGenerator = new EmailGenerator();
        Email email;
        email = emailGenerator.GenerateChristmasEmail("returning");
        assertEquals("Dear Our Returning Customer,", email.GetGreetings());
    }

    @Test
    public void testBody() {
        EmailGenerator emailGenerator = new EmailGenerator();
        Email email;
        email = emailGenerator.GenerateChristmasEmail("frequent");
        assertEquals("Merry christmas and happy new year!", email.GetBody());
    }

    @Test
    public void TestFooter() {
        EmailGenerator emailGenerator = new EmailGenerator();
        Email email;
        email = emailGenerator.GenerateChristmasEmail("new");
        assertEquals("See you soon!", email.GetFooter());
    }

    @Test
    public void TestInvalidCustomer() {
        EmailGenerator emailGenerator = new EmailGenerator();
        Email email;
        email = emailGenerator.GenerateChristmasEmail("");
        assertEquals(null, email.GetFooter());
    }

}
