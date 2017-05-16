public class Solution {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        int start = 1;
        int end = x;
        int mid = 0;
        int ans = 0;
        while(start <= end){
            mid = ((start + end) / 2);
            if((x / mid) == mid) return mid;
            if((x / mid) > mid){// x > mid *mid
                start = mid+1;
                ans = mid;
            } 
            else{// x < mid * mid
                end = mid -1;
            } 
        }
        return ans;
    }
}