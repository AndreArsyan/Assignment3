/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: VIPChristmasGreetingsEmail.java
 * Description: This class is responsible for the methods and attributes of an email for VIP customer.
 */
package edu.bu.met.cs665.assignment3;

/**
 * This is the VIPChristmasGreetingsEmail class.
 * This class is responsible for creating an Email content for VIP customer.
 */
public class VIPChristmasGreetingsEmail implements EmailFactory{
    @Override
    public String generateGreetings(){
        return "Dear Our Most Valued Member,";
    };

    @Override
    public String generateHeader(){
        return "We hope this email finds you and your family well.";
    };

    @Override
    public String generateBody(){
        return "We would like to say merry christmas to you and your family.";
    };

    @Override
    public String generateFooter(){
        return "Thank you for being our VIP customer";
    };
}
