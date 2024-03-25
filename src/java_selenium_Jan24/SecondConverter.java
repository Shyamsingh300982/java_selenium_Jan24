package java_selenium_Jan24;

import java.util.Scanner;

public class SecondConverter {

	public static void main(String[]args) { 

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a second number");		
		int second = sc.nextInt();
				
				int hrs = second/3600;
				
				int min = (second%3600)/60;
				
				int sec = second%60; 
				
				System.out.println(hrs +" Hours "+ min +" Minutes " + sec +" Second");
}
}