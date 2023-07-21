package DSA_SELF.Heaps.LinkedList;
import java.util.*;

public class MergeList {
    static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node merge (Node h1, Node h2) {
        if (h1 == null) return h2;
        if (h2 == null) return h1;

        Node l1 = (h1.data < h2.data) ? h1 : h2;
        Node l2 = (h1.data < h2.data) ? h2 : h1;
        Node res = l1;
        Node tmp = null;
        while (l1 != null && l2 != null) {
            while (l1 != null && l1.data <= l2.data) {
                tmp = l1;
                l1 = l1.next;
            }

            tmp.next = l2;
            tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        return res;
    }
    static Node intersection (Node head1, Node head2) {
        Node a = head1;
        Node b = head2;
        while (a != b) {
            // a = a == null ? headB : a.next;
            if (a == null) a = head2;
            else a = a.next;
            // b = b == null ? headA : b.next;
            if (b == null) b = head1;
            else b = b.next;
        }
        return b;
    }

    static Node delNormal (Node head, Node del) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.next == del) {
                tmp.next = tmp.next.next;
            }
            else {
                tmp = tmp.next;
            }
        }
        return head;
    }

    static void delWithoutHead (Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    static void deleteGiven (Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.next != null && temp.next.data == val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    static void deleteDuplicates (Node head) {
        Node curr = head;
        Node tmp = head;
        while (curr != null) {
//            Node tmp = head;
            while (tmp != null && tmp.data == curr.data) {
                tmp = tmp.next;
            }
            curr.next = tmp;
            curr = tmp;
        }
    }




    public static void main(String[] args) {
        Node head1 = new Node(2);
        Node one = new Node(4);
        Node two = new Node(16);
        Node three = new Node(40);
        head1.next = one; one.next = two;
        two.next = three;

        Node h = new Node(1);
        Node onee = new Node(2);
        Node tw = new Node(4);
        Node th = new Node(4);
        Node fr = new Node(4);
        Node vr = new Node(5);

        h.next = onee;
        onee.next = tw; tw.next = th; th.next = fr; fr.next = vr;
//        deleteGiven(h, 4);
deleteDuplicates(h);

        Node head2 = new Node(1);
        Node on = new Node(5);
//        Node thr = new Node(20);
        head2.next = on;
//        on.next = thr;

//        Node ans = merge(head1, head2);
//        Node ans = intersection(head1, head2);
//        delWithoutHead(two);
//        Node ans = delNormal(head1, two);
        Node tmp = h;
        while (tmp != null){
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        }
        System.out.print("null");
    }
}
