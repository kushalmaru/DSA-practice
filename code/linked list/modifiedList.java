// https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/?envType=daily-question&envId=2024-09-06   3217

import java.util.HashSet;

public class modifiedList {
    public static void main(String[] args) {
        
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    static ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }

        while(head != null  && hs.contains(head.val)){
            head = head.next;
        }

        ListNode temp = head;
        while(temp.next != null){
            if(hs.contains(temp.next.val)){
                temp.next = temp.next.next;
            } else{
                temp = temp.next;
            }
        }
        return head;
    }
}
