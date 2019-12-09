package fibonacci;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int i;
		int a=0;
		int b=1;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		count=sc.nextInt();
		System.out.print("The fibonacci series is ");
		System.out.print(a+" "+b);
		for(i=2;i<count;i++) {
			sum=a+b;
			a=b;
			b=sum;
			
			System.out.print(sum+" ");
		}
		
	}

}
