	package java_selenium_Jan24;
	import java.util.Scanner;
	public class ArmstrongNumber{
	public static void main (String[]args ) {
		
	Scanner cd = new Scanner(System.in);
	System.out.println("enter any value");

	int i = cd.nextInt();
	int a = i;
	int sum = 0;
	int cube;
	int j;
	
		while (i!=0) {
		j=i%10;   
		i=i/10;  
		cube = j*j*j;
		sum=sum+cube;          
		
				}
	if (a==sum) {
	System.out.println(a + " = is armstong value");
	}
	else {
		System.out.println(a + " = is not a armstong value");
	}}}
