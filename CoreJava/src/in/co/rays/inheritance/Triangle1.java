package in.co.rays.inheritance;

public class Triangle1 extends Math { 
	
	private int base;
	private int height; 
	
	public void setBase(int base) {
		this.base=base;	
	}
	public int getBase() {
		return base;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	
	
	public void area() {
		int A=getBase()*getHeight()/2; 
		System.out.println("BASE = "+getBase()+"\nHEIGHT = "+getHeight());
		System.out.println("THE AREA OF TRIANGLE IS = "+A);
	}
	

}

