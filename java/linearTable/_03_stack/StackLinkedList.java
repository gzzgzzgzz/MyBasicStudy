package linearTable._03_stack;

import linearTable.StackBasicOperation;
import lombok.Getter;
import lombok.Setter;

/*
* 栈的链式存储结构采用单链表的头插法来进行。
* O（1）
* */
public class StackLinkedList<E> implements StackBasicOperation<StackLinkedList<E>,E> {


    @Getter
    @Setter
    private StackLinkedListNode<E> head;


    @Override
    public void InitStack(StackLinkedList<E> l) {
        l.head = new StackLinkedListNode<E>();
    }

    @Override
    public boolean StackEmpty(StackLinkedList<E> l) {
        return l.head.getNext() == null ? true : false;
    }

    @Override
    public void Push(StackLinkedList<E> l, E e) {
        StackLinkedListNode<E> temp = new StackLinkedListNode<E>(e);
        temp.setNext(l.head.getNext());
        l.head.setNext(temp);
    }

    @Override
    public E Pop(StackLinkedList<E> l) {
        if (l.StackEmpty(l)){return null;}
        StackLinkedListNode<E> temp = l.head.getNext();
        l.head.setNext(temp.getNext());
        return (E) l.head.getNext();
    }

    @Override
    public E GetTop(StackLinkedList<E> l) {
        if (l.StackEmpty(l))return null;
        return  l.head.getNext().getData();
    }

    @Override
    public void DestroyStack(StackLinkedList<E> l) {
        l.head = null;
    }

    public static void main(String[] args) {
        StackLinkedList<Integer> l = new StackLinkedList<Integer>();
        l.InitStack(l);
        l.Push(l,100);
        l.Push(l,200);
        l.Push(l,300);
        System.out.println(l.GetTop(l));
        l.Pop(l);
        l.Pop(l);
        System.out.println(l.GetTop(l));

    }
}
