package oop.day5.thread;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Printing 0-9:");
        for (int i=0; i<10; i++){
            System.out.println("Printed: " + i);
            Thread.sleep(2000);
        }
        System.out.println("Done");
    }
}
/*
here thread is paused for a fixed duration of time of 2 sec,
the Thread does not lack anything and resumes after the given time
 */