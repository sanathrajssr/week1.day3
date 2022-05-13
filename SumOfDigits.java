package Asignmentweek1.day4;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int B=76309;
		int sum=0;
		
		while(B>0) {
			int rem = B%10;
			sum=sum+rem;
			B=B/10;
		}
		
		System.out.println("Sum of digits is:"+sum);
		

	}

}
