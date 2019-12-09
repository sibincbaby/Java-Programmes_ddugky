package auction;
import java.util.Scanner;
public class Bid {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		int bid[];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of applications");
		num=sc.nextInt();
		bid= new int[num];
		System.out.println("Enter the amount(in crores)");
		for(i=0;i<num;i++) {
			bid[i]=sc.nextInt();
		}
		int large=bid[0];
		for(i=1;i<num;i++) {
			if(bid[i]>large) {
				large=bid[i];
			}
		}
		
		System.out.println("The winning bid is "+large +" crores");
	}

}
