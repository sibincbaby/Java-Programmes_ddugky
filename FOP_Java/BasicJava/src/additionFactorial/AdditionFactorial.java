package additionFactorial;
import java.util.Scanner;
public class AdditionFactorial {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		int i;
		Scanner sc= new Scanner(System.in);
		do {
			do {
		System.out.println("Enter  a number");
		num=sc.nextInt();
			}while(num<0);
		
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
		sum=0;
		}while(true);
	}
}