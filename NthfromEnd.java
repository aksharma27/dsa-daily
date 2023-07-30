package DSA_SELF.Heaps.LinkedList;

public class NthfromEnd {
    //Remove nth node from end : eg -> 1-> 2, n = 2 => list = 2->
    static class ListNode {
        ListNode next;
        int data;
        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        head.next = one;
        ListNode a = removeNthFromEnd(head, 2);
        ListNode temp = a;
        while (temp != null) {
            System.out.print(a.data + "-> ");
            temp = temp.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
