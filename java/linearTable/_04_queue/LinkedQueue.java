package linearTable._04_queue;

import linearTable.QueueBasicOperation;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LinkedQueue<E> implements QueueBasicOperation<LinkedQueue<E>,E> {

    private LinkedQueueNode<E> head;
    private LinkedQueueNode<E> tail;

    @Override
    public void InitQueue(LinkedQueue<E> l) {
        head = new LinkedQueueNode<>();
        tail = head;
        tail.setNext(null);
    }

    @Override
    public boolean QueueEmpty(LinkedQueue<E> l) {
        if (head == tail) return true;
        return false;
    }

    @Override
    public void Offer(LinkedQueue<E> l, E e) {
        LinkedQueueNode<E> temp = new LinkedQueueNode<>(e);
        l.tail.setNext(temp);
        l.tail = temp;
    }

    @Override
    public E Poll(LinkedQueue<E> l) {
        if (QueueEmpty(l)) return null;
        LinkedQueueNode<E> temp =  l.head.getNext();
        if (temp != l.tail){
            l.head.setNext(l.head.getNext().getNext());
        }else {
            //如果是最后一个
            l.head = l.tail;
        }
        return temp.getData();
    }

    @Override
    public E GetTop(LinkedQueue<E> l) {
        return null;
    }

    public void PrintLinkedQueue(LinkedQueue<E> l){
        System.out.print("{");
        LinkedQueueNode<E> temp = l.head.getNext();
        ArrayList<E> arrayList = new ArrayList<>();
        while (temp != null){
            arrayList.add(temp.getData());
            temp = temp.getNext();
        }
        System.out.print(arrayList.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("}");
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> l = new LinkedQueue<>();
        l.InitQueue(l);
        l.Offer(l,100);
        l.Offer(l,200);
        l.Offer(l,300);
        l.Poll(l);
        l.Poll(l);
        l.Poll(l);
        l.Poll(l);
        l.PrintLinkedQueue(l);

    }
}
