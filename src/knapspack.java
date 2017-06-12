
public class knapspack {
    
    
    
    public static void main(String[] args) {
        int[] weight = {2,3,4,5};
        int[] value = {3,7,2,9};
        int res = knapspack(weight, value , 5);
        System.out.println(res);
    }
    
    public static int knapspack(int[] weight , int[] value , int W) {
        int N = weight.length;
        int[][] m = new int[N+1][W+1];
        
        for(int i = 0 ; i <= N ; i++) {
             for(int j = 0 ; j <= W ; j++) {
                if(i == 0 || j ==0) m[i][j] =0;
                else if(weight[i-1] > j) m[i][j] = m[i-1][j];
                else m[i][j] = max(m[i-1][j], value[i-1] + m[i-1][j-weight[i-1]]);
            }
             dump(m);
        }
           
        return m[N][W];
    }
    public static int max(int a , int b) {
        return a > b ? a : b;
    }
    public static void dump(int[][] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[0].length;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
            
                
    }
    
}
