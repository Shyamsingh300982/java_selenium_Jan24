package Assignment;

import java.util.Scanner;

public class PositiveNegativeProgram {
public static void main (String[]args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter any Number");
	int value = sc.nextInt();
	if (value>0) {
		System.out.println("Number is Positive");
		}
	else if (value == 0){
		System.out.println("Number is Zero(Neutral)");
	}
	else {
		System.out.println("Number is Negative");
	}}}
