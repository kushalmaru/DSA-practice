// https://leetcode.com/problems/remove-duplicates-from-sorted-list/   83

public class deleteDuplicates {
    public static void main(String[] args) {
        
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else{
                temp = temp.next;
            }
        }
        return head;
    }
}
