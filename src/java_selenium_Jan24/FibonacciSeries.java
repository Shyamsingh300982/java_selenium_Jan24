package java_selenium_Jan24;
public class FibonacciSeries {
public static void main (String[]args) {

int n1=0, n2=1;
int n3;
int count =10;
int i;

System.out.print(n1+" "+n2);

for (i=2;i<count;++i) {
	n3=n1+n2;
	System.out.print(" " + n3);
	n1=n2;
	n2=n3;
}}}