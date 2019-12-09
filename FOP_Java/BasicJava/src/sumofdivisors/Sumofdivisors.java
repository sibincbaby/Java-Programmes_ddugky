package sumofdivisors;
import java.util.Scanner;
public class Sumofdivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		int sum=0;
		int arr[];
		Scanner sc= new Scanner(System.in);
		do{
		System.out.println("Enter a number");
		num=sc.nextInt();
		arr=new int[num/2];
		int j=0;
			for(i=1;i<=num/2;i++) {
				if((num%i)==0) {
				sum=sum+i;
				arr[j]=i;
				j++;
				}
			
			}
			System.out.print("The divisors of the number are ");
			for(i=0;i<j;i++) {
				System.out.print(+arr[i]+" ");
		}
			if(sum==num) {
		System.out.println("\nThe sum of the divisors are "+sum+"\nIt is a perfect number");
		sum=0;
			}
			else {
				System.out.println("\nThe sum of the divisors are "+sum+"\nIt is not a perfect number");
				sum=0;
			}
				
			
		}
		
		while(true);
	}
	

}
