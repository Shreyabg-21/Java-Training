package Overloading;

public class Main {

	public static void main(String[] args) {
    
		Calculator obj = new Calculator ();
        System.out.println("Integer addition: " + obj.add(10, 20));
        System.out.println("Decimal addition: " + obj.add(2.5, 3.5));
    }
}