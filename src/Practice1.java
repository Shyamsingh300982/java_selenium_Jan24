import java.util.Scanner;

public class Practice1 {
public static void main (String[]args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any value");
	int i = sc.nextInt();
	int a = i;
	int sum1 = ArmMethod.armstrong(i);
	System.out.println(sum1);
	if(a==sum1) {
		System.out.println(a+"is Armstrong no.");
	}
	else {
		System.out.println(a+"is not armstrong no.");
	}
	
	
}
	
}

class ArmMethod{
	
	public static int armstrong(int i) {
	
	int cube;
	int j;
	int sum = 0;{
	while (i!=0){
	j = i%10;
	i = i/10;
	cube = j*j*j;
	sum=sum+cube;
	}
	return sum;
	
}
	}
	}
	