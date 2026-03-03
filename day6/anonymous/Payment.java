package oop.day6.anonymous;

public interface Payment {
    void pay();
}
class PaymentDemo {
    public static void main(String[] args) {
        // Boilerplate Code
        Payment p = new Payment() {
            public void pay() {
                System.out.println("Payment done using credit card.");
            }
        };
        p.pay();
    }
}

/*
ℹ️ points to remember :
⭐ one-time implementation
⭐ no need to create separate class
⭐ it is used in events and callback functions
 */