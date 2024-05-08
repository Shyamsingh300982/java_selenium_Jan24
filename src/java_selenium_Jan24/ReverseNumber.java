	package java_selenium_Jan24;
	import java.util.Scanner;
	public class ReverseNumber {
	public static void main (String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a value");
	int n = sc.nextInt();
	//int rev = 0;
	
	reverse sc1 = new reverse();
	int reverseValue = sc1.revs(n);
	
	System.out.println("Reverse number is: " + reverseValue);
	}}
	
	class reverse{
	
	int revs (int n) {
	int rev = 0;
	int r;
	while (n!=0) {
	r = n%10;   
	rev = rev*10 + r; 
	n = n/10; 
	}
	return rev;
	}}
	
	