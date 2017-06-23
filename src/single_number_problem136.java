public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for(; index < nums.length-1 ;){
            int number = nums[index];
            int next = nums[index+1];
            if(number == next) index+=2;
            else if(number != next) return nums[index];
        }
        return nums[index];
    }
}