package Assignment;

import java.util.Scanner;

public class NumberOfDaysInAMonth {
public static void main (String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the month from 1-12");
	int month = sc.nextInt();	
	
	int days = 0;
	if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)  { //1,3,5,7,8,10,12
		days = 31;
	}
	else if (month==4 || month==6 || month==9 || month==11) {
		days = 30;
	}
	else if (month == 2) {
		days =28;
	} else {
	System.out.println("Invalid month entered, Please enter correct month between 1-12 only");
	return;
	}
	System.out.println("No. of days in a month of " + month + " is : " + days);
	}}
