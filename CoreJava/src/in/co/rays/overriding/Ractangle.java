package in.co.rays.overriding;

public class Ractangle extends Shape { 
	
	
	 int length;
	 int width;
	
	public void setLength(int length) {
		this.length=length;
	} 
	public int getLength() {
		return length;
	} 
	
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth () {
		return width;
	} 
	
	
	@Override
	public void area() {
		System.out.println("OVERRIDING BY ABSTRACT");
		int a=length*width; 
		System.out.println("LENGTH IS = "+width+"\nWIDTH IS = "+width);
		System.out.println("AREA OF RACTANGLE IS = "+a);
		System.out.println();
		
	} 
	
	
}
