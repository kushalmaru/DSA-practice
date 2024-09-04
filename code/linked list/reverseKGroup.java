// https://leetcode.com/problems/reverse-nodes-in-k-group/   25

public class reverseKGroup {
    public static void main(String[] args) {
        
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode kThNode = findKThNode(temp, k);
            if(kThNode == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            ListNode nextNode = kThNode.next;
            kThNode.next = null;

            reverse(temp);

            if(temp == head){
                head = kThNode;
            } else{
                prev.next = kThNode;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }

    private static ListNode findKThNode(ListNode temp, int k){
        k = k - 1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    private static ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
