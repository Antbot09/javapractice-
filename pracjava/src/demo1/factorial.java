package demo1;

public class factorial {
	static int factorial(int n) {
		if(n==0) 
			return 1;
	else 
			return(n*factorial(n-1));
	}
	public static void main(String[] args) {
//		int fact = 1, number=5; ****************Another Method*******************
//		for(int i=1;i<=number;i++) {
//			 fact = fact*i;
//		}
//		System.out.println("The factorial of "+ number + " is "+fact);
		
		System.out.println(factorial(5));
		}
	}


