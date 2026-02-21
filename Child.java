package overriding;

public class Child extends Parent {

		void show() {
			System.out.println("child static method");
		}
		public static void main(String[] args) {
			Parent p= new Child();
			p.show();
		}

	}