package Assignment;

import java.util.Scanner;

public class BreakLoopGivingInputNumbeBelow0 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	while(true) {
	System.out.println("Enter any value");
	int i = sc.nextInt();
	if (i<0) {
	break;	}
	}}}
