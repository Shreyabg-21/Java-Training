package oop;

public class Puppy extends Animal {
		void Display() {
			System.out.println("puppy barks");
		}
		public static void main(String args[]) {
			Puppy p = new Puppy();
			p.Display();
		
			p.print();
		}

	}

