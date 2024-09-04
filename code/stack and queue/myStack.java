// https://leetcode.com/problems/implement-stack-using-queues/   225

import java.util.LinkedList;
import java.util.Queue;

public class myStack {
    public static void main(String[] args) {
        
    }



    
    static Queue <Integer> q = new LinkedList<>();
    static void MyStack() {
        
    }
    
    static void push(int x) {
        q.add(x);
        for(int i = 0; i < q.size() - 1; i++){
            q.add(q.remove());
        }
    }
    
    static int pop() {
        return q.remove();
    }
    
    static int top() {
        return q.peek();
    }
    
    static boolean empty() {
        return q.isEmpty();
    }
}
