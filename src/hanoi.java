import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class hanoi {

    public static void main(String[] args) {
        hanoi(3, "a", "b", "c");

    }
    public static void hanoi(int n , String a , String  b , String c) {
        if(n == 1)
            System.out.println("move plate " + n + " from "+ a + " to " + c);
        else {
            hanoi(n-1, a, c, b);
            System.out.println("!!move plate " + n + " from "+ a + " to " + c);
            hanoi(n-1, b, a, c);
        }
    }
}
