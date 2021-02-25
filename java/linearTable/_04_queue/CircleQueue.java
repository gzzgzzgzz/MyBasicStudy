package linearTable._04_queue;

import linearTable.QueueBasicOperation;
import lombok.Getter;
import lombok.Setter;

public class CircleQueue<E> implements QueueBasicOperation<CircleQueue<E>,E> {

    @Getter
    @Setter
    private int MaxSize = 0;

    @Getter
    @Setter
    private int front,rear;

    @Getter
    @Setter
    private Object[] data;

    @Override
    public void InitQueue(CircleQueue<E> l) {
        this.data = new Object[this.MaxSize];
        front = rear = 0;
    }

    @Override
    public boolean QueueEmpty(CircleQueue<E> l) {
        if (l.front == l.rear) return true;
        else return false;
    }

    @Override
    public void Offer(CircleQueue<E> l, E e) {
        //判断它满的情况


        l.rear ++;

    }

    @Override
    public E Poll(CircleQueue<E> l) {
        return null;
    }

    @Override
    public E GetTop(CircleQueue<E> l) {
        return null;
    }



}
