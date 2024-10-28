/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: Email.java
 * Description: This class is responsible for the methods and attributes of an email.
 */

package edu.bu.met.cs665.assignment3;

/**
 * This is the Email class.
 * This class is responsible for representing an Email.
 */
public class Email {
    private String greetings;
    private String header;
    private String body;
    private String footer;

    /*
     * Create the content of the email using factory
     */
    public void GenerateEmailWithFactory(EmailFactory emailFactory) {
        this.greetings = emailFactory.generateGreetings();
        this.header = emailFactory.generateHeader();
        this.body = emailFactory.generateBody();
        this.footer = emailFactory.generateFooter();
    }

    /*
     * return the Header of the email
     */
    public String GetHeader() {
        return this.header;
    }

    /*
     * return the Greetings of the email
     */
    public String GetGreetings() {
        return this.greetings;
    }

    /*
     * return the Body of the email
     */
    public String GetBody() {
        return this.body;
    }

    /*
     * return the Footer of the email
     */
    public String GetFooter() {
        return this.footer;
    }

    /*
     * Print the content of the email
     */
    public void print(){
        System.out.println(greetings + "\n" + header + "\n" + body + "\n" + footer);
    }
}
