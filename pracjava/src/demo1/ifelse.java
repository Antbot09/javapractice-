package demo1;

public class ifelse {
	public static void main(String[] args) {
		int x =10;
		int y = 21;
		if(x+y > 22) {
			System.out.println("X + Y is greater than 20");
		}else {
			System.out.println("X + Y is smaller than 20");
		}
		String city = "Noida";
		if(city=="Meerut") {
			System.out.println("City is Meerut");
		}else if(city=="Delhi") {
			System.out.println("City is Delhi");
		}else if(city=="Jaypur") {
			System.out.println("City is Jaypur");
		}else {
			System.out.println(city);
		}
		int num = 2;
		switch(num) {
		case 0:
			System.out.println("The number is 0");
			break;
		case 1:
			System.out.println("The number is 1");
			break;
		default:
			System.out.println(num);
		}
		
		
			//*********************TERNARY OPERATOR******************************8
		int num1 = 13;
		String output = (num1%2==0)?"Is even":"Is odd";
		System.out.println("The output is "+ output);
		
	}

}
