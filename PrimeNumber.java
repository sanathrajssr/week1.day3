  package Assignmentweek1.day3;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=10;
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(n+"is a prime number");
		}
		else {
			System.out.println(n+"is not a prime number");
		}
		// TODO Auto-generated method stub

	}


		

	}


