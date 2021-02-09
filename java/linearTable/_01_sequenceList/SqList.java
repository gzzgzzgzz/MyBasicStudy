package linearTable._01_sequenceList;

import linearTable.BasicOperation;


public class SqList<E> implements BasicOperation<SqList<E>,E> {
    //顺序表的最大大小。
    //顺序表是顺序存储的存储结构，因此它的存储方式也是顺序的。
    //而要保证它的顺序，则需要用数组来约束它。
    //下面的字段就规定了这个数组的最大大小，同时也是顺序表的最大大小
    private int MaxSize = 0;

    //线性表的当前长度
    private int length = 0;

    private Object[] data;

    public<E> SqList(int maxSize){
        this.MaxSize = maxSize;
    }

    @Override
    public void InitList(SqList<E> l) {
        data = new Object[MaxSize];
        this.length = 0;
    }


    @Override
    public int Length(SqList<E> l) {
        return l.length;
    }

    @Override
    public int LocateElem(SqList<E> l, E e) {
        for (int i = 0; i < l.data.length; i++) {
            if (l.data[i] == e) return i + 1;
        }
        return -1;
    }

    public void dd(){
        data = new Object[]{1,2,3,4,55};
    }

    public static void main(String[] args) {
        SqList<Integer> sqList = new SqList<>(4);
        sqList.InitList(sqList);
        sqList.dd();
    }

    @Override
    public E GetElem(SqList<E> l, int i) {
        return null;
    }

    @Override
    public void ListInsert(SqList<E> l, int i, E e) {

    }

    @Override
    public E ListDelete(SqList<E> l, int i) {
        return null;
    }

    @Override
    public void PrintList(SqList<E> l) {

    }

    @Override
    public void Empty(SqList<E> l) {

    }

    @Override
    public void DestroyList(SqList<E> l) {

    }


}
