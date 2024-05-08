package java_selenium_Jan24;

import java.util.Scanner;

public class FindMaxValue {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
				
		int greatest = num1;
		//System.out.println(greatest);
		if (num2>greatest) {
			greatest = num2;
			//System.out.println(greatest);
		} if (num3>greatest) {
			greatest = num3;
		//	System.out.println(greatest);
			}
		System.out.println("the greatest number is: " + greatest);
		}}