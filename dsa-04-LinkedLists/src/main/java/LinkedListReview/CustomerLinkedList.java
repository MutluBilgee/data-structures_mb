package LinkedListReview;

public class CustomerLinkedList {
 CNode head;
 CNode tail;
 int size;

    // methods

    boolean isEmpty(){
        return head==null;
    }
    void insertLast(CNode customerNode){
        // case 1: list is empty
        if(isEmpty()){
            head=tail=customerNode;
        }else{// case2 list is not empty
            tail.next=customerNode;
            tail=customerNode;
        }
        size++;
    }
    void printNames(){
        CNode current=head;
        while(current!=null){
            if (current==head) System.out.print(" Head ");
            else if (current==tail) System.out.print(" Tail ");
            System.out.print(current.name + " => ");
            if (current.next==null) System.out.print("null");
            current=current.next;
        }
    }
    void deleteByName(String name){
        CNode prev=head;
        CNode current=head;
        while(current!=null) {
            if (current.name.equals(name)){
                // case 1 its head
                if (current==head){
                    // sub case one element in list Head == Tail
                    if(head==tail) {
                        tail=null;
                    }
                    head=current.next;
                    current.next=null;// optional not required
                }
                else if (current==tail){// case 2 its tail
                    prev.next=null;
                    tail=prev;
                }
                else {// case 3 in the middle}
                    prev.next=current.next;
                    current.next=null;// optional not required
                }
                size--;
            }
            prev=current;
            current=current.next;

        }
    }
}
