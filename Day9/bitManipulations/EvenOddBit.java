package Day9.bitManipulations;

public class EvenOddBit {
    public static void main(String[] args) {
        int n = 2;
        if((n & 1) == 0){
            System.out.println(n + " is EVEN");
        }else {
            System.out.println(n + " is ODD");
        }
    }
}