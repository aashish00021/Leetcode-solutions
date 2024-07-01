import java.util.*;

public class rotateArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k = k % nums.length; // If k >= arr.length it will give k

        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(arr));


        // Another Solution 

        // int nums[] = {1,2,3,4,5,6,7};
        // int k = 3;
        // k  = k % nums.length;
        // int arr[] = new int[nums.length];
        // int j = 0;
        // for(int i = k+1; i < nums.length; i++){
        //     arr[j++] = nums[i];
        // }
        // for(int i = 0; i <= k; i++){
        //     arr[j++] = nums[i];
        // }
        // System.out.println(Arrays.toString(arr));
    }
}