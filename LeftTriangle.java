public class LeftTriangle {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {      // rows
            for (int j = 1; j <= i; j++) {     // stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
