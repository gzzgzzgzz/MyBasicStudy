package linearTable._02_linkedList;

import linearTable.BasicOperation;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DoublyLinkedList<E> implements BasicOperation<DoublyLinkedList<E>,E> {

    private DoublyLinkedListNode head;



    @Override
    public void InitList(DoublyLinkedList<E> l) {
        head = new DoublyLinkedListNode();
        head.setNext(null);
        head.setPre(null);
        head.setData(0);
    }

    @Override
    public int Length(DoublyLinkedList<E> l) {
        return (int) l.head.getData();
    }

    @Override
    public int LocateElem(DoublyLinkedList<E> l, E e) {
        if (l.Empty(l)) return -1;
        int i = 1;
        DoublyLinkedListNode temp = l.head.getNext();
        while (temp != null){
            if (temp.getData().equals(e)){
                return i;
            }
            temp = temp.getNext();
            i++;
        }
        return -1;
    }

    @Override
    public E GetElem(DoublyLinkedList<E> l, int i) {
        if (l.Empty(l)) return null;
        if (i<1||i>l.Length(l)){
            return null;
        }
        DoublyLinkedListNode temp = l.head.getNext();
        int pos = 1;
        while (temp != null){
            if (pos == i){
                return (E) temp.getData();
            }
            temp = temp.getNext();
            pos ++;
        }
        return (E) temp.getData();
    }

    @Override
    public void ListInsert(DoublyLinkedList<E> l, int i, E e) {
        if (i < 1 || i > l.Length(l) + 1){
            return;
        }
        DoublyLinkedListNode temp = l.head;
        int pos = 0;
        while (pos < l.Length(l) - 1){
            if (pos == i - 1){
                //找到插入的前1个位置
                DoublyLinkedListNode newNode = new DoublyLinkedListNode();
                newNode.setData(e);
                newNode.setNext(temp.getNext());
                temp.getNext().setPre(newNode);
                temp.setNext(newNode);
                newNode.setPre(temp);
                break;
            }
            pos ++;
            temp = temp.getNext();
        }
        return;
    }

    @Override
    public E ListDelete(DoublyLinkedList<E> l, int i) {
        if (i<1||i>l.Length(l)){
            return null;
        }
        int pos = 1;
        DoublyLinkedListNode temp = l.head.getNext();
        while (temp != null){
            if (i == pos){
                //找到删除的位置
                temp.getNext().setPre(temp.getPre());
                temp.getPre().setNext(temp.getNext());
                return (E) temp.getData();

            }
            pos ++;
            temp = temp.getNext();
        }
        return null;
    }

    @Override
    public void PrintList(DoublyLinkedList<E> l) {
        System.out.print("{ ");
        if (!l.Empty(l)){
            DoublyLinkedListNode temp = l.head.getNext();
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
    public boolean Empty(DoublyLinkedList<E> l) {
        return l.head.getNext() == null ? true:false;
    }

    @Override
    public void DestroyList(DoublyLinkedList<E> l) {
        l.head.setNext(null);
        l.head.setData(0);
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> l = new DoublyLinkedList<Integer>();
        l.InitList(l);
        l.ListInsert(l,1,1);
        l.ListInsert(l,2,2);
        l.ListInsert(l,3,3);
        l.ListInsert(l,4,4);
        l.ListInsert(l,4,15);

        l.PrintList(l);
       // System.out.println(doublyLinkedList.Empty(doublyLinkedList));
       // System.out.println(doublyLinkedList.Length(doublyLinkedList));
    }



}
