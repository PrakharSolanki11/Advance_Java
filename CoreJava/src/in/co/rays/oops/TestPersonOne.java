package in.co.rays.oops;

public class TestPersonOne { 
	
	
	public static void main(String[] args) {
		
		PersonOne p= new PersonOne();
		
		p.setFirstname("Prakhar");
		p.setLastname("Solanki");
		p.setAddress("Indore Madhys Predesh");
		p.setContact(9977585934L); 
		
		System.out.println(p.getFirstname());
		System.out.println(p.getLastname());
		System.out.println(p.getAddress()); 
		System.out.println(p.getContact());
		
	}

}
