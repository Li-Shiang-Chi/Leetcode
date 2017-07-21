

public class MinStack {

    /** initialize your data structure here. */
    
    Node head;

    public MinStack() {
    }
    
    public void push(int x) {
        Node n = new Node(x);
        if(head == null){
            head = n;
            head.min = x;
            return ;
        }
        n.next = head;
        head = n;
        head.min = Math.min(head.next.min , x);
    }
    
    public void pop() {
        Node next = head.next;
        head = next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
public class Node{
    int val;
    int min;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */