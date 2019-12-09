package alphabetscombinations;
import java.util.Scanner;
public class Combinations {
private int count;
	public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int fact=1;
		int i;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter the number alphabets in your name" );
		Combinations obj = new Combinations();
		obj.setCount(sc.nextInt());
		for(i=1;i<=obj.getCount();i++) {
			fact=fact*i;
		}
		
		System.out.println("The number of combination is "+fact);
		fact=1;
		}while(true);
	}

}
