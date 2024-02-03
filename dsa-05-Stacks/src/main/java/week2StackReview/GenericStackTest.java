package week2StackReview;

public class GenericStackTest {
    public static void main(String[] args) {
        GStack<Integer>myStack = new GStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());//prints 3
        System.out.println(myStack.pop());//prints 2 => new top
        System.out.println(myStack.peek());//prints 1 without removing
        System.out.println(myStack.size());//size is 1

    }
}
