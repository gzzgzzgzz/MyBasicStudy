package linearTable;

/*
* 基本操作的Java实现，
* 为了在C和Java中间做一层转换层。
*
* 本函数没有任何具体逻辑功能，类似于pojo。
* */
//SL -- 顺序表
//E  -- 元素的数据类型
public interface BasicOperation<SL,E> {

    public void InitList(SL l);
    public int Length(SL l);
    public E LocateElem(SL l, E e);
    public E GetElem(SL l,int i);
    public void ListInsert(SL l,int i,E e);
    public E ListDelete(SL l,int i);
    public void PrintList(SL l);
    public void Empty(SL l);
    public void DestroyList(SL l);
}
