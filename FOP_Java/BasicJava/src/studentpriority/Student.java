package studentpriority;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

import drill.Arrange;

public class Student {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int i;
		int marks[]; 
		Scanner br = new Scanner(System.in);
		do {
			
		//Reading  Student details////	
		System.out.println("\nEnter the number of students");
		count = br.nextInt();
		marks = new int[count];
		System.out.println("Enter the marks of students");
		for(i=0;i<count;i++) {
			 marks[i]=br.nextInt();
		}
		System.out.println("The priority of marks is");
		Priority order = new Priority(marks,count);
		order.display();
		
	}while(true);

		
	}
	
}
	


