package demo1;

public class bike extends abs{
	@Override
	public void start() {
		System.out.println("Start with kick");
	}

	public static void main(String[] args) {
		
		bike b = new bike();
		b.start();
		
		car c = new car();
		c.start();
	}


}
