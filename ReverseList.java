package DSA_SELF.Heaps.LinkedList;

public class ReverseList {
    static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node revList (Node head) {
       Node dum = null;
        while (head != null) {
            Node nxt = head.next;
            head.next = dum;
            dum = head;
            head = nxt;
        }
        return dum;
    }

    public static void main(String[] args) {
        Node head1 = new Node(5);
        Node one = new Node(7);
        Node two = new Node(10);
        Node three = new Node(40);
        head1.next = one; one.next = two; two.next = three;
        Node ans = revList(head1);
        while (ans != null) {
            System.out.print(ans.data + "->");
            ans = ans.next;
        }

    }
}
