package java_selenium_Jan24;

import java.util.Scanner;

public class DisplaySquareCubeFouthPower {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		
		int square = i*i;
		int cube = i*i*i;
		int fourthPower = i*i*i*i;

		System.out.println("Square: " + square);
		System.out.println("Cube: " + cube);
		System.out.println("FourthPower: " + fourthPower);
				
	}
}
