package stack;

import lombok.Data;

import java.util.Stack;

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
        LinkedStack<Integer> linkedStack = new LinkedStack(3,0);
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);
        //linkedStack.pop();
        linkedStack.printStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack);
    }
}
class TreeNode{
    TreeNode left;
    TreeNode right;

    int val;
    public TreeNode(int val){
        this.val = val;
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n.left = n2;
        n.right = n3;
        n2.left = null;
        n2.right = null;
        n3.right = null;
        tracer(n);
    }

    public static void tracer(TreeNode root){
        //递归出口
        if (root == null)
            return;
        //递归体
        System.out.println(root.val);
        tracer(root.left);
        tracer(root.right);
    }
}

