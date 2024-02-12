package in.co.rays.inheritance;

public class TestShape extends Rectangle { 
	
	public static void main(String[] args) { 
		
		TestShape p= new TestShape(); 
		
		p.setColor("YELLO"); 
		p.setHome("AIR CONDITIONER"); 
		p.setCar("TATA HARRIER"); 
		p.setVehicleNum("MPO9 HH 1111");  
		
		p.setBase(10); 
		p.setHeight(20); 
		
		
		p.setLength(2);
		p.setBreath(4);
		
		
		System.out.println("         *********DETAILS********"); 
		p.detail(); 
		
		System.out.println("\n\n\n       *********AREA OF TRIANGLE********"); 
		p.area();
		
		System.out.println("\n\n\n       *********AREA OF RECTANGLE********"); 
		p.Area2();
		
		
	}

}
