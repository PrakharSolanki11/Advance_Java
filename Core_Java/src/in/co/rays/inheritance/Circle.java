package in.co.rays.inheritance;

public class Circle { 
	
	private int radius;  
	
	public void setRadius(int radius) {
		
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	
	
	public void Area2() {
		
		
		double C= 3.14*getRadius()*getRadius();  
		System.out.println("RADIUS IS = "+getRadius());
		System.out.println("THE AREA OF CIRCLE IS = "+C);
	}

}
