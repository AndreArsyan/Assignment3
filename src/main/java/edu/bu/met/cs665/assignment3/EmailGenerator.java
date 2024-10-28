/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: EmailGenerator.java
 * Description: This class is responsible for the methods and attributes of an email generator.
 */
package edu.bu.met.cs665.assignment3;

/**
 * This is the EmailGenerator class.
 * This class is responsible for representing an EmailGenerator.
 */
public class EmailGenerator {

    /**
     * Generate Christmas email with factory
     */
    public Email GenerateChristmasEmail(String customerSegment) {
        Email email = new Email();

        switch (customerSegment) {
            case "business":
                BusinessChristmasGreetingsEmail businessEmail = new BusinessChristmasGreetingsEmail();
                email.GenerateEmailWithFactory(businessEmail);
                break;
            case "returning":
                ReturningChristmasGreetingsEmail returningEmail = new ReturningChristmasGreetingsEmail();
                email.GenerateEmailWithFactory(returningEmail);
                break;
            case "frequent":
                FrequentChristmasGreetingsEmail frequentEmail = new FrequentChristmasGreetingsEmail();
                email.GenerateEmailWithFactory(frequentEmail);
                break;
            case "new":
                NewChristmasGreetingsEmail newEmail = new NewChristmasGreetingsEmail();
                email.GenerateEmailWithFactory(newEmail);
                break;
            case "vip":
                VIPChristmasGreetingsEmail vipEmail = new VIPChristmasGreetingsEmail();
                email.GenerateEmailWithFactory(vipEmail);
                break;
            default:
                break;
        }

        return email;
    }
}
