package drill;

public class Arrange {
	int i;
	int j;
	float small;
	float h2[];
	int count=0;
	int num2;
	

	Arrange(float[] h,int num){
		h2 = new float[num];
		num2=num;
		for(i=0;i<num;i++) {
			
			for(j=0;j<num;j++) {
				if(h[i]>h[j]) {
					count++;
				}
				//h2[count]=h[i];
				//count=0;
			}h2[count]=h[i];
			count=0;
			
		}
		
	}
	void display(){
		for(i=0;i<num2;i++) {
			System.out.println(h2[i]);
		}
		
	}
	
	
}
