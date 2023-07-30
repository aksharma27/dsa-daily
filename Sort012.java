package DSA_SELF.Heaps.LinkedList;

public class Sort012 {
    static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void doubleList (Node head) {
        Node prev = null;
        prev.next = head;
        Node temp = head;
        while (temp != null) {
            prev.next = temp.next;
            temp = temp.next;
            prev=prev.next;
        }

    }

//    static Node sort (Node head) {
//        Node tmp
//    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(2);
        Node four = new Node (1);
        Node five = new Node(2);
        Node six = new Node(0);
        Node seven = new Node(2);
        Node eight = new Node(2);

        head.next = two; two.next = three; three.next = four; four.next = five;
        five.next = six; six.next = seven; seven.next = eight;

    }
}
