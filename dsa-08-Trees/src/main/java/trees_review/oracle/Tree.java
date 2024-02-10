package trees_review.oracle;

import java.util.ArrayList;

public class Tree {
 Node root;
 boolean isEmpty(){
     return root==null;
 }
    void insert(int value){
     Node newNode=new Node(value);
      if (isEmpty()) root=newNode;
      Node current=root;
      while(true){
          // if data<root
          if(value<current.value){
              if(current.leftChild==null) {
                  current.leftChild=newNode;
                  break;
              }
              else current=current.leftChild;
          }
          // if data> root
          else if(value>current.value){
                if(current.rightChild==null) {
                  current.rightChild=newNode;
                  break;
              }
              else current=current.rightChild;
          }
          else break;
      }
    }
    public ArrayList<Integer> findPath(int value){
        ArrayList<Integer> result=new ArrayList<>();
        if(isEmpty()) return result;
        Node current=root;
        while(current!=null){
            if(value<current.value) {
                result.add(current.value);
                current=current.leftChild;
            } else if (value> current.value){
                result.add(current.value);
                current=current.rightChild;
            } else{
                result.add(current.value);
                return result;
            }
        }
        return new ArrayList<Integer>();
    }

}
