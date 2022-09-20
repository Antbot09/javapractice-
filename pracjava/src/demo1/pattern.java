package demo1;

public class pattern {

	public static void main(String[] args) {
//		int j,row= 6;
//		for(int i=0;i<row;i++) {
//			for( j=2*(row-i);j>=0;j--) {
//				System.out.print(" ");
//			}
//				for( j=0;j<=i;j++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//		for(int i=0;i<row;i++) {
//			for(j=row-i;j>1;j--) {
//				System.out.print(" ");
//			}
//			for(j=0;j<=	i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i=row;i>=1;i--) {
//			for(j=row;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		int number, n=7;
		for(int i=0;i<n;i++) {
			number=1;
			for(int j=0;j<=i;j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
		}
	}


