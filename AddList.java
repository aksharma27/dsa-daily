package DSA_SELF.Heaps.LinkedList;

public class AddList {
    static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node getIntersectionNode(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return b;
    }

    static Node addList (Node h1, Node h2) {
        Node d = new Node(0);
        Node tmp = d;
        int sum = 0;
        int carry = 0;
        while (h1 != null || h2 != null || carry > 0) {
            if (h1 != null){
                sum += h1.data;
                h1 = h1.next;
            }
            if (h2 != null) {
                sum += h2.data;
                h2 = h2.next;
            }
            sum += carry;
            tmp.next = new Node(sum % 10);  //1
            carry = sum / 10;       //1
            tmp = tmp.next;
            sum = 0;
        }
        return d.next;
    }
    public static void main(String[] args) {
        Node head1 = new Node(4);
        Node one = new Node(1);
        Node two = new Node(8);
        Node three = new Node(4);
        head1.next = one; one.next = two; two.next = three;


        Node head2 = new Node(5);
        Node on = new Node(6);
        Node thr = new Node(1);
        head2.next = on; on.next = thr; thr.next = two;
//        Node ans = addList(head1, head2);

        Node ans = getIntersectionNode(head1, head2);
//        while (ans != null) {
//            System.out.print(ans.data + " -> ");
//            ans = ans.next;
//        }
        System.out.println(ans.data);
    }
}
