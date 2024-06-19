package in.co.rays.inheritance;

public class Math { 
	
	private String firstname;
	private String lastname; 
	private String rollnum;
	private String address; 
	
	
	public String getFirstname() {
		return firstname;
	}
    public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getRollnum() {
		return rollnum;
	}
	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void detail() {
		
		System.out.println("FIRST NAME = "+getFirstname()+"\nLAST NAME = "+getLastname()+"\nADDRESS = "+getAddress()+"\nENROLLMENT NUMBER = "+getRollnum());
		
	}
	
	
}
