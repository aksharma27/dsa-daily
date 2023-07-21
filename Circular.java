package DSA_SELF.Heaps.LinkedList;

public class Circular {
    static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void traverse (Node head) {
        Node tmp = head;
        do {
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        }
        while (tmp != head);
        System.out.println(tmp.data);
    }

    static void delete (Node head, Node node) {
        Node temp = head;
        while (temp.next != node) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node o = new Node(1);
        Node t = new Node(2);
        Node th = new Node(3);
        Node fr = new Node(4);

        head.next = o; o.next = t; t.next = th; th.next = fr; fr.next = head;
        delete(head, th);
        traverse(head);
    }
}
