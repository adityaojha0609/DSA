/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 1;
        while(temp.next!=null){
           len++;
           temp=temp.next;
        }
        ListNode temp2 = head;
        int c = 1;
        while(c<=len/2){
          c++;
          temp2= temp2.next;
        } 
        return temp2;
    }
}