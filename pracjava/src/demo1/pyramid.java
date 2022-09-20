package demo1;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//*********************upper pyrMID*************
//		int term = 6;
//		for(int i=0;i<=term;i++) {
//			for(int j=term;j>=i;j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		int i=1;
	    do{
	        if(i==5){
	    	        //using continue statement
	                i++; 
	    		continue;//it will skip the rest statement
	    	}
	    	System.out.println(i);
	        i++;
	    }while(i<=10);
	}
	
}

