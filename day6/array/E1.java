package oop.day6.array;

public class E1 {
    public static void main(String[] args) {
        // Method 1
        int[] arr1;
        arr1 = new int[5]; // memory allocation [20 bytes]
        // declaration + Memory allocation in single line
        // if we did not provide value
        // the jvm uses fallback mechanism
        // it uses the default value of that data type

        // Method 2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        System.out.println(arr1[3]);

        // Method 3
        int[] arr3 = {1,2,3,4,5};
        // Method 4
        int[] arr4 = new int[]{1,2,3,4,5};
    }
}
