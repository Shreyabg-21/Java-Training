package oop.day5.thread;

public class FestRegistration {

    static class FormFilling extends Thread{
        public void run(){
            System.out.println("Form Filling Started");

        }
    }

    static class DocumentsUpload extends Thread {
        public void run() {
            System.out.println("Document Upload Started!");
        }
    }

    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Confirmation Email Sent!");
        }
    }

    public static void main(String[] args) {
        FormFilling t1 = new  FormFilling();
        DocumentsUpload t2 = new  DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();

    }
}
