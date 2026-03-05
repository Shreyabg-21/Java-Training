package Day7.DSA.Searching;
public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1; // if not found, return an invalid index
    }
    public static void main(String[] args) {
        int[] arr = {10,52,0,8,1,3};
        System.out.println(linearSearch(arr, 80)); // -1
        System.out.println(linearSearch(arr, 8)); // 3
    }
}



/*⭐⭐⭐here the time complexity will be O(n) because only one for loop
the fastest time complete will be if the number is present in the first place
and the time complexity will be more if the number is found in the last place*/