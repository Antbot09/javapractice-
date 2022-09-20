package demo1;
import java.lang.Math;

public class armstrongnum {

	public static void main(String[] args) {
//		int num =153, remainder, originalNumber,result=0;
//		originalNumber = num;
//		while(originalNumber!=0) {
//			remainder = originalNumber%10;
//			result +=Math.pow(remainder, 3);
//			originalNumber /=10;
//		}
//		if(result==num) {
//			System.out.println("Is a armstrong Number");
//		}else {
//			System.out.println("Not a armstorng Number");
//		}
		int n=1,rem,temp,res=0;
		temp = n;
		while(n>0) {
			rem = n%10;
			res = res+(rem*rem*rem);
			n /=10; 
		}
		if(res==temp) {
			System.out.println("Is armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}

}
