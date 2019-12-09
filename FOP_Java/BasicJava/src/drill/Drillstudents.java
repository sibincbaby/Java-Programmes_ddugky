package drill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drillstudents {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int count;
		int i;
		float h[];    //declaring array
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			
		//Reading  Student details////	
		System.out.println("\nEnter the number of students");
		count = Integer.parseInt(br.readLine());
		h = new float[count];
		System.out.println("Enter the heights of students");
		for(i=0;i<count;i++) {
			 h[i]= Float.parseFloat(br.readLine());
		}
		Arrange order = new Arrange(h,count);
		order.display();
		
		
	}while(true);

}
}
