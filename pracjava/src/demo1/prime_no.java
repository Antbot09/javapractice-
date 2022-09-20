package demo1;

public class prime_no {
	static void primeno(int n) {
		int  m=0, flag=0;
		//int n =3;
		m = n/2;
		if(n==0||n==1) {
			System.out.println(n+ "Not a prime Number");
		}else {
			for(int i=2;i<m;i++) {
				if(n%2==0) {
					System.out.println(n+" Not a prime number");
					flag =1 ;
					break;
				}
			}
				
		}if(flag==0) {
			System.out.println(n+" Is a Prime Number");
		}
	}
		public static void main(String[] args) {
			primeno(1);
			primeno(3);
			primeno(20);
			primeno(23);
			
	}

}
