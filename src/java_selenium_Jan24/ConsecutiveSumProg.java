package java_selenium_Jan24;

import java.util.Scanner;

	public class ConsecutiveSumProg {

		public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int i = sc.nextInt();
		
		int a = i;
		for (int b=0;b*b<i;b++) {
		int sum = b*b +(b+1)*(b+1) + (b+2)*(b+2) + (b+3)*(b+3);
		if (sum == a) {
		System.out.print("Consecutive numbers are : ");
		System.out.println(b + "," +( b+1) + "," + (b+2) + "," + (b+3));
		}}	
		System.out.println("Enter a valid number");
		}}