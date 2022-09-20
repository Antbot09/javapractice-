package demo1;
import java.lang.Math;
public class randomnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("The first random number is "+Math.random());
//		System.out.println("The second random number is "+Math.random());
		int max =200, min=1;
		System.out.println("The random value from "+ min +" to "+ max);
		int a = (int)(Math.random()*(max-min+1)+min);
		System.out.println(a);

	}

}
