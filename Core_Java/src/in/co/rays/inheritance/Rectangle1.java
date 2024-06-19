package in.co.rays.inheritance;

public class Rectangle1 extends Triangle { 
	
	int length;
	int breath;
	
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	} 
	
	public void setBreath(int breath) {
		this.breath=breath;
	}
	public int getBreath() {
		return breath;
	} 
	
	public void Area2() {
		
		int B=getLength()*getBreath(); 
		System.out.println("LENGTH = "+getLength()+"\nBREATH = "+getBreath());
		System.out.println("THE AREA OF RECTANGLE IS = "+B);
	}

}
