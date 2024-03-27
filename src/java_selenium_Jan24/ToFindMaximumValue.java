package java_selenium_Jan24;

import java.util.Scanner;

public class ToFindMaximumValue {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values");
		
		int max=0;		
		//int k[]= {12,23,45,56,34,67,29,38,56,9};
		int k[]=new int[10];
//		for (int i=1; i<=10 ; i++) {
//			int j = sc.nextInt();
//			if(j>max) {
//				max=j;
//				System.out.println("maximum no is="+max);
//		}
			for(int ii=0;ii<10;ii++) {
				int m=sc.nextInt();
				k[ii]=m;
				
			}
			for(int count=0;count<10;count++) {
				//System.out.println(k[count]);
				if(k[count]>max) {
					max=k[count];
					
				}
				
			}
			System.out.println(max);
	}
	

		
		
		
	}
	

