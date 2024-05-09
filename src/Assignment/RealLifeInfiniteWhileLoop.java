package Assignment;

import java.util.Scanner;

public class RealLifeInfiniteWhileLoop {
public static void main (String[]args) {
	String password = "password123";
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the password: "); 
	while(true) {
		String input = sc.nextLine();
	 		 
	    if (password.equals(input)) { 
	    System.out.println("Access granted. Welcome!");
	    break;
	    } else {
	    System.out.println("Incorrect password. Please try again."); 
}}}}
