package LinkedListReview;

public class LinkedListTest {
    public static void main(String[] args) {
        SLNode node1=new SLNode(1);
        SLNode node2=new SLNode(2);
        SLNode node3=new SLNode(3);
        SLNode node4=new SLNode(4);
        SLNode node5=new SLNode(5);
        System.out.println(node1.next);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        SLNode current=node1;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
        System.out.println("Next of Node5 :" + node5.next);

    }
}
