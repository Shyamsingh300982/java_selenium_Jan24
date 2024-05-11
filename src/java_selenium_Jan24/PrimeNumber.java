	package java_selenium_Jan24;
	import java.util.Scanner;
	public class PrimeNumber {
	public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Value");
	while (true) {		
	int i=sc.nextInt();
	int count=0;
	if(i<=1){
	System.out.println("not prime no");
	}
	for(int k=2;k<i;k++) {    
			if(i%k==0){           
			count++;    
			break;
			}}
			if(count==0) {
				System.out.println(i + " is a prime no.");
				System.out.println("Thanks for using calculator");
			break;}
			else {
				System.out.println(i + " is not a prime no.");
			}}}}