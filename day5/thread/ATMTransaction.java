package oop.day5.thread;

public class ATMTransaction extends Thread {
    public void run(){
        System.out.println("Processing ATM Transaction");

    }

    public static void main(String[] args) {
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread State: " + t.getState());
        t.start();
        System.out.println("Thread state after start: " + t.getState());
    }
}
