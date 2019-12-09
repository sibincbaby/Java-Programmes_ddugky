package toll;
import java.util.Scanner;
public class Toll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		int fare[];
		int count=0;
		int gov=0;
		Scanner sc= new Scanner(System.in);
		do{
		System.out.println("Enter the number of vehicles");
		num=sc.nextInt();
		fare= new int[num];
		System.out.println("Enter the fare collected for each vehicles");
		for(i=0;i<num;i++) {
			fare[i]=sc.nextInt();
			if(fare[i]>50) {
				count++;
			}
			else if (fare[i]==0) {
				gov++;
			}
		}
		System.out.println("Number of heavy vehicles "+count+" and the number of light weight vehicles is "+(num-(count+gov))+"\r\n");
		gov=0;
		count=0;
		
		}while(true);
	}

}
