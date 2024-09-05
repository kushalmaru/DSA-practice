// https://leetcode.com/problems/min-stack/description/   155

import java.util.Stack;

public class minStack {
    public static void main(String[] args) {
        
    }

//     static class Pair{
//     int ele;
//     int minEle;
//     Pair(int ele, int minEle){
//         this.ele = ele;
//         this.minEle = minEle;
//     }
// }

// static class MinStack {
//     static Stack<Pair> st = new Stack<>();
//     MinStack() {
        
//     }
    
//     static void push(int val) {
//         int min;
//         if(st.isEmpty()){
//             min = val;
//         } else{
//             min = Math.min(val, st.peek().minEle);
//         }
//         st.push(new Pair(val, min));
//     }
    
//     static void pop() {
//         st.pop();
//     }
    
//     static int top() {
//         return st.peek().ele;
//     }
    
//     static int getMin() {
//         return st.peek().minEle;
//     }
// }




class MinStack {
    Stack<Long> st = new Stack<>();
    long minEle = Long.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            minEle = val;
            st.push((long)val);
        } else{
            if(val < minEle){
                st.push(2L * val - minEle);
                minEle = val;
            } else{
                st.push((long)val);
            }
        }
    }
    
    public void pop() {
        if(st.peek() < minEle){
            minEle = 2 * minEle - st.pop();
        } else{
            st.pop();
        }
    }
    
    public int top() {
        if(st.peek() < minEle){
            return (int)minEle;
        }
        return st.peek().intValue();
    }
    
    public int getMin() {
        return (int)minEle;
    }
}

}
