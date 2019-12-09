package amstrong;

public class Operation {

	int sum=0;
	int ls=0;
	int temp=0;
	Operation(int num){
		temp=num;
		while(num!=0) {
			ls=num%10;
			num=num/10;
			sum=sum+(ls*ls*ls);
			}
	}
public void check() {
	if(sum==temp) {
		System.out.println("The given number is amstrong\n");
	}
	else
		System.out.println("The given number is not amstrong\n");
		
}
}
