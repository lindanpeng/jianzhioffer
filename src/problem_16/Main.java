package problem_16;

public class Main {
    static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
    public static Node reverse(Node head){
        if (head==null)
            return head;
        Node newHead=head;
        Node p=head;
        Node pNext=p.next;
        newHead.next=null;
        while (pNext!=null){
            p=pNext;
            pNext=pNext.next;
            p.next=newHead;
            newHead=p;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        head.next=n2;
        n2.next=n3;
        Node newHead=reverse(head);
        while (newHead!=null){
            System.out.println(newHead.value);
            newHead=newHead.next;
        }
    }
}
