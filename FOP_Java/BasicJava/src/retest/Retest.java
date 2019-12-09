package retest;

import java.util.Scanner;
public class Retest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[];
		int count;
		int i;
		int re=0;
		Scanner br = new Scanner(System.in);
		do {
			System.out.println("\nEnter the number of students");
			count=br.nextInt();
			marks = new int[count];
			System.out.println("Enter the marks of students");
			for(i=0;i<count;i++) {
				marks[i]=br.nextInt();
				if(marks[i]<50) {
					re++;
				}
			}
			System.out.println("Number of students appearing for retest is "+re);
		}while(true);
		

	}

}
