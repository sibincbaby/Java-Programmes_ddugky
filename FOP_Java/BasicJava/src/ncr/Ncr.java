package ncr;
import java.util.Scanner;
public class Ncr{
	int limit;
	long fact=1;
	int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int r;
		long result=0;
		
		
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the value of r");
		r=sc.nextInt();
		Ncr obj = new Ncr();
		long result1=obj.fact(n);
		long result2=obj.fact(r);
		long result3=obj.fact(n-r);
		int result4= (int) (result1/(result2*result3));
		System.out.println(result4);
		//result=0;
	}while(true);
		
	}
	
	
	public long fact(int limit) {
		fact=1;
		for(i=1;i<=limit;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
}