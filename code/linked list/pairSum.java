// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/   2130

public class pairSum {
    public static void main(String[] args) {
        
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow = reverse(slow);
        fast = head;
        int ans =0;
        while(slow != null){
            int sum = fast.val + slow.val;
            ans = Math.max(ans, sum);
            slow = slow.next;
            fast = fast.next;
        }
        return ans;
    }

    private static ListNode reverse(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
