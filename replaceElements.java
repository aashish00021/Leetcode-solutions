class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length <= 1) {
            return new int[] {-1};
        }
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;
        int max = arr[arr.length - 1];
        
        for (int i = arr.length - 2; i >= 0; i--) {
            result[i] = max; 
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        
        return result;
    }
}