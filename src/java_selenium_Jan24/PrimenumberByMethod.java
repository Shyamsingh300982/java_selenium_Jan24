package java_selenium_Jan24;

import java.util.*;

public class PrimenumberByMethod {

public static void main (String[]args) {

	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a value");	
	 
	 int n = sc.nextInt();
	 	 
	 //PrimeNo j = new PrimeNo();
	 boolean prime = PrimeNo.isPrime(n);
	 //System.out.println(prime);
	 if(prime==true) {
		 System.out.println(n+" is prime no");
	 }
	 else {
		 System.out.println(n+"is not prime no");
	 }
 }}

	class PrimeNo {
	static boolean isPrime(int n) {
		boolean ans=false;
		if (n<=1) {
		return ans;
		}
		int count=0;
		for (int i = 2; i < n; i++) {
			
			 if (n % i == 0) {
			 count++;
		
			}
	}
		if(count==0)	{
			return true;
		}
		else
		{
			return ans;
		}
		}
	}
	
	// 