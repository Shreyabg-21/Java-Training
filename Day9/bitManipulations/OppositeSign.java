package Day9.bitManipulations;

public class OppositeSign {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if ((a ^ b) < 0) {
            System.out.println(("Opposite Signs"));

        } else {
            System.out.println("same sign");
        }
    }
}