package in.co.rays.oops;

public class Age { 
	
	private String name; 
	private String lastname;
	private String enrollmentnum;
	//private static final int AGE=21; 
	private static final int AGE=25; 
	
	
	public void setName(String name) {
		this.name=name; 	
	}
	public String getName() {
		return name;
	}
	
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public String getLastName() {
		return lastname;
	}
	
	
	public void setEnrollmentNum(String enrollmentnum) {
		this.enrollmentnum=enrollmentnum;
	}
	public String getEnrollmentNum() {
		return enrollmentnum;
	} 
	
	
	
	public void Details() {
		
		
		System.out.println("NAME = "+name+"\nLAST NAME = "+lastname+"\nENROLLMENT NUMBER = "+enrollmentnum+"\nAGE = "+AGE);
	}


}
