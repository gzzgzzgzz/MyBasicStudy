package linearTable._01_sequenceList;

import linearTable.BasicOperation;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.Objects;

public class SqList<E> implements BasicOperation<SqList<Integer>,Integer> {
    //顺序表的最大大小。
    //顺序表是顺序存储的存储结构，因此它的存储方式也是顺序的。
    //而要保证它的顺序，则需要用数组来约束它。
    //下面的字段就规定了这个数组的最大大小，同时也是顺序表的最大大小
    @Getter
    private int MaxSize = 0;

    //线性表的当前长度
    @Getter
    @Setter
    private int length = 0;

    @Getter
    private Object[] data;

    public<E> SqList(int maxSize){
        this.MaxSize = maxSize;
        data = new Object[maxSize];
    }

    @Override
    public void InitList(SqList<Integer> l) {

    }

    @Override
    public int Length(SqList<Integer> l) {
        return 0;
    }

    @Override
    public Integer LocateElem(SqList<Integer> l, Integer integer) {
        return null;
    }

    @Override
    public Integer GetElem(SqList<Integer> l, int i) {
        return null;
    }

    @Override
    public void ListInsert(SqList<Integer> l, int i, Integer integer) {

    }

    @Override
    public Integer ListDelete(SqList<Integer> l, int i) {
        return null;
    }

    @Override
    public void PrintList(SqList<Integer> l) {

    }

    @Override
    public void Empty(SqList<Integer> l) {

    }

    @Override
    public void DestroyList(SqList<Integer> l) {

    }
}
