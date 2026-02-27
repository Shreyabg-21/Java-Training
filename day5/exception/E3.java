package oop.day5.exception;

public class E3 {
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Eligible 0 Access Granted");

        } else {
            throw new RuntimeException("Not Eligible - Access Denied");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
