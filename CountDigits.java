import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int count = 0;

        // Handle 0 separately
        if (num == 0) {
            count = 1;
        } else {
            num = Math.abs(num); // handles negative numbers
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}