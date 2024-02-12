package in.co.rays.oops;

public class TestPersonOne { 
	
	
	public static void main(String[] args) {
		
		PersonOne p= new PersonOne();
		
		p.setFirstname("Prakhar");
		p.setLastname("Solanki");
		p.setAddress("Indore Madhys Predesh");
		p.setContact(9977585934L); 
		
		System.out.println("FIRST NAME  =  "+p.getFirstname());
		System.out.println("LAST NAME  =  "+p.getLastname());
		System.out.println("ADDRESS  =  "+p.getAddress()); 
		System.out.println("CONTACT  =  "+p.getContact());
		
	}

}
