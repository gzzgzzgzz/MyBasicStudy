package linearTable._04_queue;

import linearTable.QueueBasicOperation;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class _timu_CircleQueue<E> implements QueueBasicOperation<_timu_CircleQueue<E>,E> {

    @Getter
    @Setter
    private int MaxSize = 0;

    public _timu_CircleQueue(int max){
        this.MaxSize = max;
    }

    @Getter
    @Setter
    private int front,rear;

    private boolean tag;//可能队满

    @Getter
    @Setter
    private Object[] data;

    @Override
    public void InitQueue(_timu_CircleQueue<E> l) {
        this.data = new Object[this.MaxSize];
        front = rear = 0;
        tag = false;
    }

    //队判空
    @Override
    public boolean QueueEmpty(_timu_CircleQueue<E> l) {
        if (l.front == l.rear && tag == false) return true;
        else return false;
    }
    //队判满
    public boolean isFull(_timu_CircleQueue<E> l){
        //如果l.rear再走1步等于l.front，则队满.⚠️：这种判断队满的方式是牺牲1个存储空间，因为l.rear指向队列最后1个元素的下一个元素的地址。
        if (l.rear == l.front && tag == true) return true;
        else return false;
    }

    @Override
    public void Offer(_timu_CircleQueue<E> l, E e) {
        if (isFull(l)) return;
        l.rear = (l.rear + 1) % l.getMaxSize();
        l.getData()[l.rear] = e;
        this.tag = true;
    }

    @Override
    public E Poll(_timu_CircleQueue<E> l) {
        if (l.QueueEmpty(l)) return null;
        E temp = (E) l.getData()[l.front];
        l.front = (l.front + 1) % l.getMaxSize();
        this.tag = false;
        return temp;
    }

    @Override
    public E GetTop(_timu_CircleQueue<E> l) {
        return (E) l.getData()[l.front];
    }


    public void PrintCircle(_timu_CircleQueue<E> l){
        System.out.print("{ ");
        ArrayList arrayList = new ArrayList();
        int i = l.front;
        while (i != l.rear){
            arrayList.add(l.getData()[i]);
            i = (i + 1) % l.getMaxSize();
        }
        System.out.print(arrayList.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(" }");
    }


    public static void main(String[] args) {
        _timu_CircleQueue<Integer> circleQueue = new _timu_CircleQueue<Integer>(3);
        circleQueue.InitQueue(circleQueue);
        circleQueue.Offer(circleQueue,1);
        circleQueue.Offer(circleQueue,2);
        circleQueue.Offer(circleQueue,3);
        circleQueue.Offer(circleQueue,4);
        circleQueue.Offer(circleQueue,4);
        circleQueue.Poll(circleQueue);
        circleQueue.Poll(circleQueue);
        circleQueue.Poll(circleQueue);
        circleQueue.Poll(circleQueue);
//        circleQueue.Offer(circleQueue,4);
//        circleQueue.Offer(circleQueue,5);
//        circleQueue.Offer(circleQueue,6);
//        circleQueue.Offer(circleQueue,7);
//        circleQueue.Offer(circleQueue,8);
//        circleQueue.Offer(circleQueue,9);
//        circleQueue.Offer(circleQueue,10);
        circleQueue.PrintCircle(circleQueue);


    }


}
