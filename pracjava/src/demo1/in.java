package demo1;

 class animal {
	void eat() {
		System.out.println("Eating...");
	}
 }
	class put extends animal{
		void bark() {
			System.out.println("Barking...");
		}
	}
	
	public class in {
	public static void main(String args[]) {
		put p = new put();
		p.eat();
		p.bark();	
		
	}
	}
 
	



