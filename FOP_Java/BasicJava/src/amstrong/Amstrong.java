package amstrong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num;
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			
		//Reading  Student details////	
		System.out.println("Enter a number");
		num = Integer.parseInt(br.readLine());
		Operation result = new Operation(num);
		result.check();
		

		}while(true);
	}

}
