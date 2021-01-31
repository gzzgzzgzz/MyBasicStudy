package stack;

public class LinkedStack<E> {

    LinkedNode<E> base = null;
    LinkedNode<E> top = null;
    private int capacity;
    //follow java's rules
    public LinkedStack(int capacity,E defaultVal){
        this.capacity = capacity;
        this.base = new LinkedNode<E>(defaultVal);
        top = base;
        init(capacity,base,defaultVal);
    }
    //init the stack
    private void init(int capacity,LinkedNode<E> root,E defaultVal){
        if (capacity <= 1) return;
        root.next = new LinkedNode(defaultVal);
        root.next.pre = root;
        init(--capacity,root.next,defaultVal);
    }
    public void tracer(LinkedNode root){
        if (root == null) return;
        tracer(root.next);
        System.out.println(root.val);
    }
    //LIFO
    public void printStack(){
        tracer(this.base);
    }
    public void push(E e){
        if (top == null){
            System.out.println("Stack over flow!!!");
            return;
        }
        top.val = e;
        top = top.next;
    }
    public void pop(){
        if (top == base){
            System.out.println("Stack is already Empty!!!");
            return;
        }
        top = top.pre;
        top.next = null;
    }
}
//single linked list
class LinkedNode<T>{
    T val;
    LinkedNode<T> pre;
    LinkedNode<T> next;
    public LinkedNode(T val){
        this.val = val;
        next = null;
        pre = null;
    }

}
class Test{
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack(3,0);
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);
        //linkedStack.pop();
        linkedStack.printStack();

    }
}