package linearTable._01_sequenceList;

import linearTable.BasicOperation;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.Objects;

public class SqList<E> implements BasicOperation {
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
    public void InitList(Object l) {

    }

    @Override
    public int Length(Object l) {
        return 0;
    }

    @Override
    public Object LocateElem(Object l, Object o) {
        return null;
    }

    @Override
    public Object GetElem(Object l, int i) {
        return null;
    }

    @Override
    public void ListInsert(Object l, int i, Object o) {

    }

    @Override
    public Object ListDelete(Object l, int i) {
        return null;
    }

    @Override
    public void PrintList(Object l) {

    }

    @Override
    public void Empty(Object l) {

    }

    @Override
    public void DestroyList(Object l) {

    }
}
