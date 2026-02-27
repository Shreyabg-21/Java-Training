package oop.day5.thread;

public class ResultDeclaration {
    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval....");
        wait();
        System.out.println("Result Declared");
    }
    synchronized void approve(){
        notify();
    }
    public static void main(String[] args) throws Exception {
        ResultDeclaration rd = new  ResultDeclaration();
        new Thread(() -> {
                    try {
                        rd.declareResult();
                    }catch (Exception e){}
                }).start();
        Thread.sleep(2000);
        new Thread(() ->
                rd.approve()).start();
    }
}
/*
the declareresult() method waits untill another thread calls
notify(). during wait(), the thread releases the lock, allowing other
threads to enter the synchronized code.

ℹ️ Pints to Remember:
⭐sleep() -> time based
⭐wait() -> condition based
⭐wait() -> releases lock -> by checking the notify() method
⭐wait() -> is used in inter-threaded

eg: Order placed -> Preparing -> Prepared -> Delivering -> Delivered.

 */