public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int index = 0;
        for(int number : nums){
            if(target > number) index++;
            else break;
        }
        return index;
    }
}