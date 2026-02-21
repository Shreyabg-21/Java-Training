package oop;

public class Dog extends Animal { 
	void sound() {
		System.out.println("dog barks");
		
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.print();
	}
}
