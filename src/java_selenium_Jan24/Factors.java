package java_selenium_Jan24;
import java.util.Scanner;
public class Factors {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter value");
	int x = in.nextInt();
	
	System.out.println("factor of the " + x + " are:");
	int i=1;
	
	while (i<=x) {
	if (x%i==0) {  
	System.out.println(i);
		}
	i++;
		}}}



