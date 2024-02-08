package in.co.rays.oops;

public class PersonOne {    
	
	
	private String firstname ;
	private String lastname ;
	private String address;
	private long contact;
	
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public String getFirstname() { 
		return firstname;
		
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setAddress(String address) {
		this.address=address;
	} 
	public String getAddress() {
		return address;
	}
	public void setContact(long contact) {
		this.contact=contact;
	} 
	public long getContact() {
		return contact;
	}

}
