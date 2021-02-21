package linearTable._03_stack;

import linearTable.StackBasicOperation;
import linearTable._01_sequenceList.SqList;
import lombok.Getter;
import lombok.Setter;

public class StackSqList<E> implements StackBasicOperation<StackSqList<E>,E> {

    private int MaxSize = 0;

    @Getter
    @Setter
    private int top;

    @Getter
    @Setter
    private Object[] data;



    public<E> StackSqList(int maxSize){
        this.MaxSize = maxSize;
    }

    @Override
    public void InitStack(StackSqList<E> l) {
        data = new Object[MaxSize];
        top = -1;//有的教材可能会把top=0，后者top指向最上面元素的下一个。我不这样做，有歧义。
    }

    @Override
    public boolean StackEmpty(StackSqList<E> l) {
        return top == -1 ? true : false;
    }

    public boolean StackOverFlow(StackSqList<E> l){
        return top == MaxSize - 1 ? true : false;//栈的top指针（在顺序表中理解成索引）从0开始
    }

    @Override
    public void Push(StackSqList<E> l, E e) {
        if (StackOverFlow(l)){
            System.out.println("Stack Over Flow");
            return;
        }
        l.top ++;
        l.data[l.top] = e;
    }

    @Override
    public E Pop(StackSqList<E> l) {
        if (StackEmpty(l)){
            System.out.println("Stack is Empty!!!");
            return null;
        }
        E temp = (E) l.data[top];
        l.data[top] = null;
        l.top --;
        return temp;
    }

    @Override
    public E GetTop(StackSqList<E> l) {
        return (E) l.data[top];
    }

    @Override
    public void DestroyStack(StackSqList<E> l) {
        l.data = null;
        l.top = -1;
    }

    public static void main(String[] args) {
        StackSqList<Integer> l = new StackSqList<>(100);
        l.InitStack(l);
        l.Push(l,100);
        l.Push(l,200);
        l.Push(l,300);
        while (!l.StackEmpty(l)){
            System.out.println(l.Pop(l));
        }
        l.Push(l,100);
        l.Push(l,200);
        l.Push(l,300);
        l.DestroyStack(l);
        l.Push(l,100);
    }
}
