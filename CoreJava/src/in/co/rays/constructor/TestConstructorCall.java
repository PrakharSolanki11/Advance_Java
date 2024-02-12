package in.co.rays.constructor;

public class TestConstructorCall { 
	
     public static void main(String[] args) {
    	 
    	 ConstructorCall p1=new ConstructorCall();
    	 ConstructorCall p5=new ConstructorCall("CREATA","  HYUNDAI  ");
    	 ConstructorCall p2=new ConstructorCall("PRAKHAR "," SOLANKI","MADHYA PRADESH"); 
    	 ConstructorCall p3=new ConstructorCall("INNOVA","  CRYSTA  ","INDORE");
    	 ConstructorCall p4=new ConstructorCall("MAHINDRA ","  THAR  ","NEW DEHLI"); 
    	//System.out.println(p2.name+" "+p2.lastname); 
    	 p3.CarDetails(); 
     

    }

}
