package demo1;

public class classobj {
	int roll_no;
	String name;
	
	void show(int r, String n ) {
		roll_no = r;
		name = n;
	}
	void info() {
		System.out.println("The output is "+roll_no+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classobj obj = new classobj();
		obj.roll_no = 21;
		obj.name = "XYZ";
		
		obj.info();

	}

}
