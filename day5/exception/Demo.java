package oop.day5.exception;

public class Demo {
    public static void main(String[] args) {
        try {
            int balance = 2000;
            int withdraw = 3000;
            if (withdraw > balance) {
                System.out.println("Insufficient Funds");
            } else {
                System.out.println("Withdraw Successfull.");
            }
        }catch(ArithmeticException e){
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }