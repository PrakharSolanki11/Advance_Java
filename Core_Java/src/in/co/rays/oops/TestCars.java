package in.co.rays.oops;

public class TestCars {  
	
	public static void main(String[] args) {
		
		Cars p=new Cars();
		p.carname="MAHINDRA THAR";
		p.carownername="SANAT CHOUHAN";
	    p.vehiclenumber="MP09HH7777";
	    p.drivenkm="10000KM";
	    p.address="INDORE MADHYA PREDESH"; 
	    
	    
	    System.out.println("Car Name = "+p.carname);
	    System.out.println("Carowner Name= "+p.carownername);
	    System.out.println("Vehicle Number = "+p.vehiclenumber);
	    System.out.println("Address = "+p.address);
	    System.out.println("Driven Kilomeers = "+p.drivenkm);
} 
}
