package java_selenium_Jan24;
import java.util.*;
public class MinutesIntoYearsAndDays {
 public static void main (String[]args) {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter minutes");
	 
	 int i = sc.nextInt();
	 int a = i;
	 int year = a/525600;
	 int yearConvertIndays= a/1440;			 
	 int remainingDays  = (a%525600)/1440;
	 int remainingMin  = ((a%525600)%1440);
	 	 
	 System.out.println(year + " Year");
	 System.out.println(yearConvertIndays + " Days (Year Converted Into days");
	 System.out.println(remainingDays + " RemainingDay");
	 System.out.println(remainingMin + " RemainingMin");
	 
	 
	 
	 }}
