class Solution {
public:
    int hammingDistance(int x, int y) {
        int dis = 0;
        int n = x ^ y; // get difference bits
        
        while(n != 0){
            if (n & 1 == 1) dis++;
            n = n >> 1;
        }
        return dis;
    }
};