
public class fibonacci {
    public static void main(String[] args) {
        int[] f = new int[10];
        for(int i = 0 ; i<f.length ; i++)
            f[i] = -1;
        f[0] = 0;
        f[1] = 1;
        int res = fibo(f, 9);
        System.out.println(res);
    }
    
    public static int fibo(int[] f, int n) {
        if(n <= 1) return f[n];
        if(f[n] == -1) {
            f[n] = fibo(f, n-1) + fibo(f, n-2);
        }
        return f[n];
    }
    
}
