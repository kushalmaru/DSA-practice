// https://leetcode.com/problems/online-stock-span/   901

import java.util.Stack;

public class StockSpanner {
    public static void main(String[] args) {
        
    }

    static Stack<int[]> st;
    StockSpanner() {
        st = new Stack<>();
    }
    
    static int next(int price) {
        int prevSpan = 1;
        while(!st.isEmpty() && st.peek()[0] <= price){
            prevSpan = prevSpan + st.pop()[1];
        }
        st.push(new int[] {price, prevSpan});
        return prevSpan;
    }
}
