public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(head.val + " " + head.next.val
                + " " + head.next.next.val
                + " " + head.next.next.next.val
                + " " + head.next.next.next.next.val);
        head = reverseList(head);
        System.out.println(head.val + " " + head.next.val
                + " " + head.next.next.val
                + " " + head.next.next.next.val
                + " " + head.next.next.next.next.val);
    }
    public static ListNode reverseList(ListNode head) {
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
