package leapyear;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int i;
		int a=0;
		int b=1;
		int sum;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter a year");
		year=sc.nextInt();
		if((year%100!=0)&&(year%4==0)||(year%400==0)) {
			
			System.out.println("It is a leap year");
		}
		else
			System.out.println("It is not a leap year");
	}while(true);
		

	}

}


	