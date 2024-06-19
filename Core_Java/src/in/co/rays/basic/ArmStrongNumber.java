package in.co.rays.basic;

public class ArmStrongNumber {
	
	
	public static void main(String[] args) {
		int a=1634;
		
		int b=0;
		int c;
		int d=a;
		
		
		while (d>0) {
			
			c=d%10;
			
			b=b+(c*c*c*c);
			d=d/10;
			
			
			
		}
		if (b==a) {
			
			System.out.println("yes");
			
		}else {
			
			System.out.println("no");
		}
		
		
		
		
		
		
		
		
		
	}

}
