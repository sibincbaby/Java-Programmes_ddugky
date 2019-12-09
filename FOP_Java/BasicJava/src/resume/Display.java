package resume;

public class Display {
	
	String name;
	String age;
	String degree;
	String branch;
	String contact;
	
	Display(String name,String age,String degree,String branch,String contact) {
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.branch=branch;
		this.contact=contact;
	}
	
	
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Degree : "+degree);
		System.out.println("Branch : "+branch);
		System.out.println("Contact : "+contact);
	}

}
