package resume;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Resume {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String age;
		String degree;
		String branch;
		String contact;
		String i;
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			
		//Reading  Student details////	
		System.out.println("Enter your name");
		name=br.readLine();
		System.out.println("Enter your age");
		age=br.readLine();
		System.out.println("Enter your Degree");
		degree=br.readLine();
		System.out.println("Enter your Branch");
		branch=br.readLine();
		System.out.println("Enter your Contact Number");
		contact=br.readLine();
		Display student = new Display(name,age,degree,branch,contact);
		student.display();
		System.out.println("Do you want to continue (yes/no)");
		 i=br.readLine();
		 
		 }while(i.equals("yes"));
		}

}
