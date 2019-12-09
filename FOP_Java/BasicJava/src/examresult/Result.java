package examresult;
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[];
		int count;
		int i;
		int sum=0;
		int avg;
		Scanner br = new Scanner(System.in);
		do {
			System.out.println("\nEnter the number of subjects");
			count=br.nextInt();
			marks = new int[count];
			System.out.println("Enter the marks of student");
			for(i=0;i<count;i++) {
				marks[i]=br.nextInt();
				sum=sum+marks[i];
			}
			avg=sum/count;
			System.out.println("The avarage is "+avg);
		}while(true);
		

	}

}
