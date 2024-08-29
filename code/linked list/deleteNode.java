// https://leetcode.com/problems/delete-node-in-a-linked-list/   237

public class deleteNode {
    public static void main(String[] args) {
        
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
