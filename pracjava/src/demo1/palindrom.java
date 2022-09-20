package demo1;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
	
//		int n, sum=0, r;
//		n = 545;
//		int temp =n;
//		while(n>0) {
//		 r = n%10;
//		 sum = (sum*10)+r;
//		 n = n/10;
//		}
//		if(temp==sum) {
//			System.out.println("Is a pallindrom number");
//			
//		}else {
//			System.out.println("Is not a palindrom nnumber");
//		}
		String original, reverse="";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number/String");
		original = in.nextLine();
		int length = original.length();
		for(int i=length-1;i>=0;i--) 
			reverse = reverse+original.charAt(i);
			if(original.equals(reverse)) 
				System.out.println("Is a pallindrom number/String");
			else 
				System.out.println("Not a pallindrom number/String");
			
		}
}
