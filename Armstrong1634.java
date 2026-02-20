public class Armstrong1634 {
    public static void main(String[] args) {

        int num = 1634;
        int original = num;
        int sum = 0;
        int digits = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        // Calculate sum of digits^digits
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is NOT an Armstrong number");
    }
}