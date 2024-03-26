package java_selenium_Jan24;

import java.util.Scanner;

public class TemperatureScale {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value in decimal");
		
		double i = sc.nextDouble();
		
		double fahrenheit = i*1.8+32;
		
		double kelvin = i + 273;
		
		System.out.println(i + " Celsius = " +fahrenheit + " Fahrenheit");
		System.out.println(i +" Celsius = " + kelvin + " Kelvin");
		
		
		
	}
}
