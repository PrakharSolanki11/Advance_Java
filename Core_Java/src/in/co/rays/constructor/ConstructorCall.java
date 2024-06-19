package in.co.rays.constructor;

public class ConstructorCall { 
	
	public String name;
	public String lastname;
	public String address; 
	
	public ConstructorCall() {
		
		System.out.println("****************DEFAUIT CONSTRUCTOR CALLED*****************");
	} 
	public ConstructorCall(String name,String lastname) { 
		this.name=name;
		this.lastname=lastname;
		
		System.out.println("\n\n*************TWO PARAMETER CONSTRUCTOR CALLED**************");
		System.out.println("NAME ="+name+"\nLASTNAME ="+lastname);
		
    } 
	public ConstructorCall(String name,String lastname,String address) {
	
		this.name=name;
		this.lastname=lastname;
		this.address=address;
		
		System.out.println("\n\n***************THREE PARAMETER CONSTRUCTOR CALLED*************"); 
		System.out.println("NAME ="+name+"\nLASTNAME ="+lastname+"\nADDRESS ="+address);
		
	}
	public void CarDetails() { 
		
		System.out.println("\n\n***************DETAILS OF THE CAR ***************");
		System.out.println("NAME ="+name+"\nLASTNAME ="+lastname+"\nADDRESS ="+address);
		
	}
		
}