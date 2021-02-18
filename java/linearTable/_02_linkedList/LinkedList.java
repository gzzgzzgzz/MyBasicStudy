package linearTable._02_linkedList;

import annotation.OTIME;
import linearTable.BasicOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//搞带有头节点的链表
//头节点和头指针--头指针永远指向链表第1个元素。在带有头节点的链表中第1个元素是头节点。
public class LinkedList<E> implements BasicOperation<LinkedList<E>,E> {
    //头指针
    private LinkedListNode head;

    @Override
    public void InitList(LinkedList<E> l) {
        l.head = new LinkedListNode();
        l.head.setNext(null);
        l.head.setData(0);//头节点的数据域存放表长
    }

    @OTIME("1")
    @Override
    public int Length(LinkedList<E> l) {
        return (int) l.head.getData();
    }

    @OTIME("n")
    @Override
    public int LocateElem(LinkedList<E> l, E e) {
        if (l.Empty(l)) return -1;
        LinkedListNode temp = head.getNext();
        int i = 1;
        while (temp != null){
          if (temp.getData().equals(e)){
              return i;
          }
          i ++;
          temp = temp.getNext();
        }
        return -1;
    }

    @Override
    public E GetElem(LinkedList<E> l, int i) {
        if (l.Empty(l)) return null;
        int pos = 1;
        LinkedListNode temp = l.head.getNext();
        if (temp == null) return null;
        if (i < 1 || i > (int)l.head.getData()) return null;
        while (temp != null){
            if (i == pos){
                return (E)temp.getData();
            }
            pos ++;
            temp = temp.getNext();
        }
        return null;
    }

    @Override
    public void ListInsert(LinkedList<E> l, int i, E e) {
        if (e == null)return;
        if (i < 1 || i > (int)l.head.getData() + 1) return;
        LinkedListNode temp = l.head;
        int pos = 0;
        while (pos < i){
            if (pos == i - 1){
                //当前位置是插入位置的上一个位置
                temp.setNext(new LinkedListNode<Integer>((Integer) e,temp.getNext()));
                l.head.setData((int)l.head.getData() + 1);
            }
            temp = temp.getNext();
            pos ++;
        }
    }

    @Override
    public E ListDelete(LinkedList<E> l, int i) {
        if (l.Empty(l)) return null;
        if (i < 1 || i > (int)l.head.getData()) return null;
        LinkedListNode temp = l.head;
        int pos = 0;
        while (pos < i){
            if (pos == i - 1){
                //当前位置是删除位置的上一个位置
                temp.setNext(temp.getNext().getNext());
                l.head.setData((int)l.head.getData() - 1);
            }
            temp = temp.getNext();
            pos ++;
        }
        return null;
    }

    @Override
    public void PrintList(LinkedList<E> l) {
        System.out.print("{ ");
        if (!l.Empty(l)){
            LinkedListNode temp = l.head.getNext();
            ArrayList arrayList = new ArrayList();
            while (temp != null){
                arrayList.add(temp.getData());
                temp = temp.getNext();
            }
            System.out.print(arrayList.stream().map(String::valueOf).collect(Collectors.joining(",")));
        }
        System.out.println(" }");
    }

    @Override
    public boolean Empty(LinkedList<E> l) {
        return l.head.getNext() == null ? true : false;
    }

    @Override
    public void DestroyList(LinkedList<E> l) {
        l.head.setNext(null);
        l.head.setData(0);
    }

    //头插法
    public void headInsert(LinkedList l,int[] args){
        for (int i = 0; i < args.length; i++) {
            l.head.setNext(new LinkedListNode(args[i],l.head.getNext()));
            l.head.setData((int)l.head.getData() + 1);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.InitList(linkedList);
        linkedList.ListInsert(linkedList,1,1);
        linkedList.ListInsert(linkedList,2,4);
        linkedList.ListInsert(linkedList,3,3);
        linkedList.ListInsert(linkedList,4,2);
        linkedList.ListInsert(linkedList,5,5);
        linkedList.ListInsert(linkedList,6,6);
        linkedList.ListDelete(linkedList,1);
        linkedList.ListDelete(linkedList,1);
        linkedList.ListDelete(linkedList,1);
        linkedList.ListDelete(linkedList,1);
        System.out.println(linkedList.LocateElem(linkedList,5));
        System.out.println(linkedList.GetElem(linkedList, 2));
        System.out.println(linkedList.GetElem(linkedList, 4));
        linkedList.PrintList(linkedList);
        linkedList.headInsert(linkedList,new int[]{1,2,3,4,5,6,7});
        linkedList.PrintList(linkedList);

    }
}
