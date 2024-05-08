	package java_selenium_Jan24;
	import java.util.Scanner;
	public class SumOfDigits {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any value");
	int i = sc.nextInt();
	
	int sum = 0;
	int reverse = 0;
	while (i!=0) {
		int j;
		j=i%10; //  i=123 remainder j=3
		i=i/10; //  i=12, 
		
		sum=sum+j;
			//j=i%10;
			//i=i/10;
			//reverse=reverse*10+j;
			//reverse=0*10+3=3
			//reverse=3*10+2=32
			//reverse=32*10+1=321
		}
	System.out.println(sum);
	//System.out.println(reverse);
}
}