public class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        for(int i = n-1 ; i>=0 ; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        
        /*deal with [9] , [9,9] ,  [9,9,9] ...*/
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}