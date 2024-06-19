package in.co.rays.inheritance;

public class TestMath extends Math { 
	
	public static void main(String[] args) { 
		
		TestMath p= new TestMath(); 
		Triangle q= new Triangle(); 
		Rectangle r= new Rectangle(); 
		Circle s=new Circle();
		
		p.setFirstname("PRAKHAR");
		p.setLastname("SOLANKI");
		p.setAddress("INDORE MADHYA PRADESH");
		p.setRollnum("0818EC201038");
		
		
		q.setBase(20); 
		q.setHeight(40); 
		
		
		r.setLength(50);
		r.setBreath(100); 
		
		s.setRadius(5);
		
		
		System.out.println("\n         *********DETAILS********"); 
		p.detail(); 
		
		System.out.println("\n       *********AREA OF TRIANGLE********"); 
		q.area();
		
		System.out.println("\n       *********AREA OF RECTANGLE********"); 
		r.Area2();  
		
		System.out.println("\n       *********AREA OF CIRCLE********");
		s.Area2();
		
	}

}

