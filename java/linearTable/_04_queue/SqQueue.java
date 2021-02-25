package linearTable._04_queue;

import linearTable.QueueBasicOperation;
import lombok.Getter;
import lombok.Setter;

public class SqQueue<E> implements QueueBasicOperation<SqQueue<E>,E> {

    @Getter
    @Setter
    private int MaxSize = 0;

    @Getter
    @Setter
    private int front,rear;

    @Getter
    @Setter
    private Object[] data;


    public SqQueue(int maxSize){
        this.MaxSize = maxSize;
    }

    @Override
    public void InitQueue(SqQueue<E> l) {
        this.data = new Object[this.MaxSize];
        this.front = this.rear = 0;
    }

    @Override
    public boolean QueueEmpty(SqQueue<E> l) {
        if (this.front == this.rear) return true;
        else return false;
    }

    @Override
    public void Offer(SqQueue<E> l, E e) {
        if (isFull(l)){
            //队上溢
            return;
        }
        l.getData()[l.rear] = e;
        l.rear ++;
    }

    @Override
    public E Poll(SqQueue<E> l) {
        if (QueueEmpty(l)){return null;}
        E temp = (E) l.data[l.front];
        l.front ++;
        return temp;
    }

    @Override
    public E GetTop(SqQueue<E> l) {
        if (QueueEmpty(l)) return null;
        int temp = l.rear - 1;
        return (E) l.getData()[temp];
    }

    public boolean isFull(SqQueue<E> l){
        if (l.rear == l.getMaxSize()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SqQueue<Integer> sqQueue = new SqQueue<Integer>(100);
        sqQueue.InitQueue(sqQueue);
        sqQueue.Offer(sqQueue,1);
        sqQueue.Offer(sqQueue,2);
        sqQueue.Offer(sqQueue,3);
        System.out.println(sqQueue.Poll(sqQueue));
        System.out.println(sqQueue.Poll(sqQueue));
        System.out.println(sqQueue.Poll(sqQueue));
        System.out.println(sqQueue.Poll(sqQueue));
        System.out.println(sqQueue.QueueEmpty(sqQueue));
    }
}
