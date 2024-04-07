package java_selenium_Jan24;

import java.util.Scanner;

public class SumDiffProductAvgDistanceMaxMin {

	public static void main(String[]args) {
	 
	
		Scanner sc = new Scanner(System.in);
	
		// input
		System.out.println("Enter 2 values");
		
		if(sc.hasNextInt()) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int sum = i+j;
			int difference = i-j;
			int product = i*j;
			int average = (i+j)/2;
			int distance = i-j;
			
			if (i>j){
				System.out.println("Maximum = " + i);
				System.out.println("Minimum ="+j);
			}
			else {
				
				System.out.println("Maximum = " + j);
				System.out.println("Minimum ="+ i);
			}
				System.out.println("Sum : " + sum);		
				System.out.println("difference : " + difference);
				System.out.println("Product : " + product);
				System.out.println("Average : " + average);
				System.out.println("Distance : " + distance);
			
		}
	
		
		// calculation
		
		 	 else if(sc.hasNextDouble()) {
			 double k = sc.nextDouble();		
			 double m = sc.nextDouble();
				double doubleSum = k+m;
				double doubleDifference = k-m;
				double doubleProduct = k*m;
				double doubleAverage = (k+m)/2;
				double doubleDistance = k-m;
					if (k>m){
						System.out.println("Maximum = " + k);
						System.out.println("Minimum ="+m);
					}
					else {
						
						System.out.println("Minimum = " + k);
						System.out.println("Maximum ="+ m);
					}
					
					System.out.println("Sum : " + doubleSum);		
					System.out.println("difference : " + doubleDifference);
					System.out.println("Product : " + doubleProduct);
					System.out.println("Average : " + doubleAverage);
					System.out.println("Distance : " + doubleDistance);
		 }
		 else if(sc.hasNext()) {
			 String s=sc.next();
			 String s2=sc.next();
			 System.out.println("concatenation of strings="+s+s2);
		 }
		 else {
			 System.out.println("oops! enter any valid input");
		 }
			
		
		
		
//		double DoubleMaximum = Math.max(k , m);
//		double DoubleMinimum = Math.min(k,m);
		
		
//		System.out.println("Maximum : " + maximum);
//		System.out.println("minimum : " + minimum);
		
//		System.out.println("Maximum : " + DoubleMaximum);
//		System.out.println("minimum : " + DoubleMinimum);
		
//		
//		System.out.println("Enter first value");
//		int i = sc.nextInt();
//		System.out.println("Enter second value");
//		int j = sc.nextInt();
		
	}
	}

