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

    /*
    * 1.C的初始化是将指针送入函数
    * 在函数内为指针分配内存
    * java的初始化在构造时就已经完成了
    * 2.如果非要模仿这种方式初始化也可以，无非是构造对象时将表的初始化放到了init函数。
    * */
    /*
    * 默认的i都是位置，如果形参是index才是索引。
    * */
    public void InitList(SL l);
    public int Length(SL l);
    public int LocateElem(SL l, E e);
    public E GetElem(SL l,int i);
    public void ListInsert(SL l,int i,E e);
    public E ListDelete(SL l,int i);
    public void PrintList(SL l);
    public void Empty(SL l);
    public void DestroyList(SL l);
}
