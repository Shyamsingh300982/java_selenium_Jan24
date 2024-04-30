package Assignment;

import java.util.Scanner;

public class UnitConversionInchesToMeter {
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value");
	double i = sc.nextDouble();
	InchToMeter im = new InchToMeter();
	Double multiply = im.add(i);
	System.out.println(i + " Inch = " + multiply + " Meter");
	
}}
	
	class InchToMeter{
	double add (double i) {
	double k = i*0.0254;
	return k;
	
	
}
	}


