public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode temp = head;
        ListNode temp2 = head;

        while (temp2 != null && temp2.next != null) {
            temp = temp.next;
            temp2 = temp2.next.next;

            if (temp2 == temp) {
                return true;
            }
        }

        return false;
    }
}