package DSA_SELF.Heaps.LinkedList;

public class DoublyList {
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    static void travBack (Node last) {
        Node tmp = last;
        while (tmp != null) {
            System.out.print("<-" + tmp.data);
            tmp = tmp.prev;
        }
        System.out.println("null");
    }

    static void delete (Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
    }

    static void delteGiven (int d, Node head) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.next != null && tmp.data == d) {
                tmp.next.prev = tmp.prev;
                tmp.prev.next = tmp.next;
            }
            else if (tmp.next == null && tmp.data == d) {
                tmp.prev.next = tmp.next;
            }
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node one = new Node(1);
        Node two = new Node(3);
        Node three = new Node(4);
        Node four = new Node(4);

        head.next = one;        head.prev = null;
        one.next = two;         one.prev = head;
        two.next = three;       two.prev = one;     three.prev = two; three.next = four; four.prev = three;

        Node tmp = head;

        delteGiven(4, head);
        while (tmp != null) {
            System.out.print(tmp.data +"->");
            tmp = tmp.next;
        }
        System.out.print("null");
//        travBack(four);
    }
}
