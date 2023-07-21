package DSA_SELF.Heaps.LinkedList;

public class Mid {
    static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
//            this.next = null;
        }
    }
    static Node findMid (int n, Node head) {
        int mid = n/2;
        Node tmp = head;
        while (mid > 0) {
            tmp = tmp.next;
            mid--;
        }
        return tmp;
    }

    static Node midNode (Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        Node one = new Node(2);
        Node two = new Node(3);
        Node thre = new Node(4);
        Node four = new Node(5);
        Node five = new Node(6);
        head.next = one;
        one.next = two;
        two.next = thre;
        thre.next = four;
//        four.next = null;
        four.next = five;
//        Node ans = findMid(5, head);
        Node ans = midNode(head);
        System.out.println(ans.data);
    }
}
