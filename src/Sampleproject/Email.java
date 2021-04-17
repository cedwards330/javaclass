package Sampleproject;
import java.util.*;
import java.text.NumberFormat;

public class Email {
	
	//instance variables 
		 private String firstName; 
		 private String lastName;
		 private String password;
		 private String email;
		 private int defaultPasswordLength = 10;
		 private String companySuffix = "comic.com";
		
		 //Constructor to receive the first and last name
		 public Email(String firstName, String lastName) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Email Created:" + this.firstName + " " + this.lastName);
			
			//call a method that returns a random password
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is: " + this.password);
			
			//combine elements to generate email
			email = firstName.toLowerCase() + "." + firstName + lastName.toLowerCase() + "@" + companySuffix;
			System.out.println("Your email is: " + email);
			
		 }
			
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&";
			char [] password = new char[length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);					
			}
			return new String(password);
		}
		}
		
		 
		
		  
		 
		 
		 


