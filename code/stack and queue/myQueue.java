// https://leetcode.com/problems/implement-queue-using-stacks/   232

import java.util.Stack;

public class myQueue {
    public static void main(String[] args) {
        
    }

    static Stack<Integer> input = new Stack<>();
    static Stack<Integer> output = new Stack<>();
    static void MyQueue() {
        
    }
    
    static void push(int x) {
        while(!input.empty()){
            output.push(input.pop());
        }
        input.push(x);
        while(!output.empty()){
            input.push(output.pop());
        }
    }
    
    static int pop() {
        if(input.empty()){
            return -1;
        }
        return input.pop();
    }
    
    static int peek() {
        if(input.empty()){
            return -1;
        }
        return input.peek();
    }
    
    static boolean empty() {
        return input.empty();
    }
}
