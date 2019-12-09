package boxing;
import java.util.Scanner;
public class Boxing {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		int pos=0;
		int fouls[];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of players");
		num=sc.nextInt();
		fouls= new int[num];
		System.out.println("Enter the number of fouls made by each player");
		for(i=0;i<num;i++) {
			fouls[i]=sc.nextInt();
		}
		int small=fouls[0];
		for(i=1;i<num;i++) {
			if(fouls[i]<small) {
				small=fouls[i];
				pos=i;
			}
		}
		
		System.out.println("The eligible player is player no:"+ ++pos+"("+small+") fouls");
	}

}

