package in.co.rays.oops;

public class PersonTwo {  
	
	public void sum(int a, int b) {
		
		int sum=a+b; 
		System.out.println("sum of a and b is = "+sum);
		
	}
	public void primeNumber(int num) { 
		
		int count=0;
		for (int i = 2; i < num; i++) {
			
			if(num%i==0) {
				count++;
			
		} 
		}	
		if(count==0) {
			
			System.out.println("YES IT IS A PRIME NUMBER");
		}
		else {
			System.out.println("NO IT IS NOT A PRIME NUMBER");
		}
		
		
		
	}
	
  }



	


