public class findMaxConsecutiveOnes {
    public static void main(String[] args){
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count ++;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
}
