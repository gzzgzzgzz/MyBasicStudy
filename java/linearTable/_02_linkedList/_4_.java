package linearTable._02_linkedList;

import linearTable._03_stack.StackLinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ {
    public static void main(String[] args) {
        //构造一个单链表
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.InitList(linkedList);
        System.out.println("Please input your str(with space split):");
        Scanner sc = new Scanner(System.in);
        List<String> nodes = Arrays.stream(sc.nextLine().split(" ")).filter(e->(e!=null || !e.equals(" "))).collect(Collectors.toList());
        for (int i = 1; i <=nodes.size(); i++) {
            linkedList.ListInsert(linkedList,i,nodes.get(i - 1));
        }
        //构造一个单链栈
        StackLinkedList<String> stringStackLinkedList = new StackLinkedList<String>();
        stringStackLinkedList.InitStack(stringStackLinkedList);
        for (int i = 1; i <=nodes.size(); i++) {
            stringStackLinkedList.Push(stringStackLinkedList,nodes.get(i - 1));
        }
        linkedList.PrintList(linkedList);
        stringStackLinkedList.PrintStack(stringStackLinkedList);

    }
}
