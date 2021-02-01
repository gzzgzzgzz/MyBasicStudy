package stack;

public class LinkedStack2 {
    int size;
    Node head;
    public LinkedStack2(){
        this.size = 0;
        this.head = null;
    }

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void push(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
        size ++;
    }

    public boolean isNull(LinkedStack2 stack2){
        return stack2.size == 0 ? true : false;
    }

    public Node pop(){
        if (isNull(this)){
            System.out.println("Stack is empty!!!");
            return null;
        }else {
            Node oldHead = head;
            head = head.next;
            size --;
            return oldHead;
        }
    }

    public void printStack(Node root){
        if (root == null) return;
        System.out.println(root.val);
        printStack(root.next);
    }

    public static void main(String[] args) {
        LinkedStack2 stack2 = new LinkedStack2();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.pop();
        stack2.pop();
        stack2.pop();
        stack2.printStack(stack2.head);
    }
}
