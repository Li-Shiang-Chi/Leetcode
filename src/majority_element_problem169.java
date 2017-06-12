class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin() , nums.end());
        int mid = nums.size() / 2;
        
        int count = 0;
        
        for(int i = 0 ; i<nums.size() ; i++)
            if(nums[i] == nums[mid]) count++;
        
        
        return count > mid ? nums[mid] : 0;
    }
};