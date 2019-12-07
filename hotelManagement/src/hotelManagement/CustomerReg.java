package hotelManagement;


public class CustomerReg {
	public static int id = 0;
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	
	void register(String name,String address,String contactNumber,String email,String proofType,String proofID) {
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofID=proofID;
		
	}
		
		void display() {
			System.out.println(name);
			System.out.println(address);
			System.out.println(contactNumber);
			System.out.println(email);
			System.out.println(proofType);
			System.out.println(proofID);
			System.out.println("Customer Id is "+ ++id);
		}

	

}
