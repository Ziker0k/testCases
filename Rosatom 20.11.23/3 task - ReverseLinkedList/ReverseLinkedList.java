/**
 * Определение односвязного списка
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newList = null;
        ListNode current = head;
        while(current != null){
            ListNode lessList = current.next;
            current.next = newList;
            newList = current;
            current = lessList;
        }
        return newList;
    }
}