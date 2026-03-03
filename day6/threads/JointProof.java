package oop.day6.threads;

public class JointProof {
    static class Task extends Thread {
        public void run(){
            try {
                Thread.sleep(2000);
            }catch (Exception e) {}
            System.out.println("Task Finished!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task t = new Task();
        t.start(); // the main thead does not wait for this Thread
        t.join(); // code will wait (guaranteed!!)
        System.out.println("Main Thread Resumes.");

    }
}
