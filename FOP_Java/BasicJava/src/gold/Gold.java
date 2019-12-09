package gold;
import java.util.Scanner;
public class Gold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int goldkg;
		int total=0;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("Enter the kgs of gold");
			goldkg=sc.nextInt();
			while(goldkg>0) {
		total=total+goldkg;
		goldkg=goldkg/5;
			}
		System.out.println("Number of Sculptors can be made is "+total);
		
		}while(true);
	
	}

}
	
