package cricket;
import java.util.Scanner;
public class Economy {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numBowlers;
		int runs[];
		int i;
		int balls[];
		float economy;
		int totalBalls=0;
		int totalRuns=0;
		double totalEconomy;
		int eligible=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of bowlers\r\n");
		numBowlers=sc.nextInt();
		runs= new int[numBowlers];
		balls= new int[numBowlers];
		System.out.println("Enter the runs conceded by the bowlers");
		for(i=0;i<numBowlers;i++) {
			runs[i]=sc.nextInt();
			totalRuns=totalRuns+runs[i];
			
		}
		System.out.println("Enter the number of balls for each bowler");
		for(i=0;i<numBowlers;i++) {
			balls[i]=sc.nextInt();
			totalBalls=totalBalls+balls[i];
		}
		totalEconomy=(float) (totalRuns/(totalBalls/6.0));
		
		System.out.println("Economy of the bowlers ");
		for(i=0;i<numBowlers;i++) {
			
			economy=(float) ((runs[i])/(balls[i]/6.0));
			System.out.printf("%.1f \n",economy);
			if(economy>totalEconomy) {
				eligible++;
			}
		}
		
		System.out.println("The overall economy of the team is ");
		System.out.printf("%.1f \n",totalEconomy);
		System.out.println("The number of bowlers eligible are "+eligible);
		
		
	}

}
