class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        public void deleteNode(ListNode node) {
            ListNode next = node.next;
            if (next != null) {
                node.val = next.val;
                node.next = next.next;
            } else node = null;
        }
        
}
   class Solution {
    

       public static void main(String args[]) {
           ListNode list = new ListNode(2);
           list.next = new ListNode(3);
           list.next.next = new ListNode(4);
           list.next.next.next = new ListNode(5);
           list.deleteNode(new ListNode(3));
           System.out.println(list);
       }
   }