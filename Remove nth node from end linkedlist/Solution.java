class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        ListNode delayed = head;
        int count = 1;
        if (head.next == null && n == 1) return null;
        while (temp != null) {
            if (temp.next == null) {
                ListNode next = delayed.next;
                if (next != null) {
                    delayed.val = next.val;
                    delayed.next = next.next;
                } else delayed = null; 
                break;
            }
            if (count >= n) {
                delayed = delayed.next;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);
        removeNthFromEnd(test, 1);
    }
}