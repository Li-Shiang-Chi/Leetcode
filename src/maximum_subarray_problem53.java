public class Solution {
    public int maxSubArray(int[] nums) {
        int max = detect(nums);
        int sum = 0;
        if (max < 0 ) return max;
        
        for(int i : nums){
            sum += i;
            sum = Math.max(0,sum);
            max = Math.max(sum , max);
        }
        return max;
        
    }
    public int detect(int[] nums){
        int min = nums[0];
        for(int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] >= 0)
                return 0;
            else if(min < nums[i])
                min = nums[i];
        }
        return min;
    }
}