package demo1;

public class fibonacci {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n1= 0, n2=1, n3, count=10;
//		System.out.print(n1+" "+n2);
//		for(int i=2; i<=count;i++ ) {
//		n3 = n1 + n2;
//		System.out.print(" "+n3);
//		n1 = n2;
//		n2 = n3;
		//}
		
		//*****************Using Recursion*********************8
	  	static int n1=0,n2=1,n3=0;
	  	static void printfibb(int count) {
	  		
	  	if(count>0) {
	  		n3  = n1 + n2;
	  		System.out.print(" "+ n3);
	  		n1 = n2;
	  		n2 = n3;
	  		printfibb(count-1);
	  	}
	  	}
	  	public  static void main(String[] args) {
	  		int count =10;
	  		System.out.print(n1+ " "+n2);
	  		printfibb(count-2);
	  	}
		
	}


