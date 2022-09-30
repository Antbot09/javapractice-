package demo1;

public class interf implements I1,I2{


	@Override
	public void display() {
		System.out.println("Its i1");
	}

	@Override
	public void show() {
		System.out.println("its i2");
	}
public static void main(String[] args) {
		interf in = new interf();
		in.display();
		in.show();

	}

}
