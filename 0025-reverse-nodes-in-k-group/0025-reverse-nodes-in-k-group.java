class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        ListNode prev = null;

        // Check if there are at least k nodes
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head; // Less than k nodes, leave them unchanged
            }
            temp = temp.next;
        }

        // Reverse k nodes
        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // head is now the last node of the reversed group
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}