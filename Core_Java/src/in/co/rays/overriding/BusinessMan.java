package in.co.rays.overriding;

public class BusinessMan implements RichMan,SocialWorker {  
	int a=150000;
	int b=300000; 
	
	public void earn() {  
		int c=a+b; 
		System.out.println();
		System.out.println("TOTAL = "+c);
		System.out.println("\nTOTAL BALANCE OF RICHMAN IS = "+c);
	} 
	public void donation() {
		System.out.println("\nRICHMAN IS DONATING = "+b);	
	}
	public void party() {
		System.out.println("\nRICHMAN DO PARTY BY REMAINING = "+a);
	} 
	public void helpToOther() {
		System.out.println("\nSOCIAL WORKER HELP OTHERS ");
	}
	public void hardWorker() {
		System.out.println("\nSOCIAL WORKER ARE HARDWORKER");
		
	}
	

	

	

}
