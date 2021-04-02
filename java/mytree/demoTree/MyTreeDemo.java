package mytree.demoTree;

import linearTable._03_stack.StackLinkedList;
import linearTable._04_queue.LinkedQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyTreeDemo {

    public static void tracer(MyTree root){
        if (root == null) return;
        tracer(root.left);
        System.out.println(root.val);
        tracer(root.right);
    }

    public static void main(String[] args) {
        MyTree root = new MyTree(1);
        root.left = new MyTree(2);
        root.right = new MyTree(3);
        root.left.left = new MyTree(4);
        root.left.right = new MyTree(5);
        root.right.left = new MyTree(6);
        root.right.right = new MyTree(7);

//        Queue<MyTree> q = new LinkedList();
//        q.offer(root);
//        while (!q.isEmpty()){
//            MyTree poll = q.poll();
//            System.out.println(poll.val);
//            if (poll.left != null){
//                q.offer(poll.left);
//            }
//            if (poll.right != null){
//                q.offer(poll.right);
//            }
//        }

//        LinkedQueue<MyTree> q = new LinkedQueue<>();
//        q.InitQueue(q);
//        q.Offer(q,root);
//        while (!q.QueueEmpty(q)){
//            MyTree poll = q.Poll(q);
//            System.out.println(poll.val);
//            if (poll.left != null){
//                q.Offer(q,poll.left);
//            }
//            if (poll.right != null){
//                q.Offer(q,poll.right);
//            }
//        }
        //举这个例子想说明这两种方式一样的(自己写的数据结构和封装的)



//        LinkedList<MyTree> tree = new LinkedList<MyTree>();
//        //模拟一个递归的过程
//        //🌲的递归，将结点层层压栈。
//        //其实就是二叉树的非递归遍历
//        tracer(root);
//        System.out.println("-栈非递归-中序");
//        ////
//        MyTree fakeRoot = root;
//        while (!treeStack.isEmpty() || fakeRoot != null){
//            if (fakeRoot != null){
//                treeStack.push(fakeRoot);
//                fakeRoot = fakeRoot.left;
//            }else {
//                fakeRoot = treeStack.pop();
//                visit(fakeRoot);
//                fakeRoot = fakeRoot.right;
//            }
//        }
//        System.out.println("-栈非递归-先序");
//        fakeRoot = root;
//        while (!treeStack.isEmpty() || fakeRoot != null){
//            if (fakeRoot != null){
//                visit(fakeRoot);
//                treeStack.push(fakeRoot);
//                fakeRoot = fakeRoot.left;
//            }else {
//                fakeRoot = treeStack.pop();
//                fakeRoot = fakeRoot.right;
//            }
//        }
//        System.out.println("-栈非递归-后序"); //有问题呢
//        fakeRoot = root;
//        MyTree recode = null;//辅助记录指针
//        while (!treeStack.isEmpty() || fakeRoot != null){
//            if (fakeRoot != null){
//                treeStack.push(fakeRoot);
//                fakeRoot = fakeRoot.left;
//            }else {
//                fakeRoot = treeStack.peekFirst();//top操作
//                if (fakeRoot.right != null && fakeRoot != recode){
//                    //右子树存在并且右子树不层被访问
//                    fakeRoot = fakeRoot.right;
//                    treeStack.push(fakeRoot);
//                    fakeRoot = fakeRoot.left;
//                }else {
//                    fakeRoot = treeStack.pop();
//                    visit(fakeRoot);
//                    recode = fakeRoot;
//                    fakeRoot = null;
//                }
//            }//end else
//        }//end while



        ////

        /*
        * 试着用语言来描述，伪代码
        * 1，沿着根的左孩子，不断入栈，知道左孩子为空
        * 2，栈顶元素出栈并访问，若其右孩子为空，则继续执行2
        * 3，若其右孩子不为空，则将右子树执行1
        * */


//        MyTree fakeRoot = root;//递归中的树伪根
//        treeStack.push(root);
//        while (!treeStack.isEmpty()){
//            if (fakeRoot.left != null){
//                //0,如果根的左孩子不为空，则一直入栈
//                treeStack.push(fakeRoot.left);
//                fakeRoot = fakeRoot.left;
//            }else{
//                //如果左孩子为空，进行判断。
//                //1,右孩子为空，则出栈，重复1
//                //2,右孩子不为空，则右孩子入栈，重复0。
//                visit(fakeRoot);
//                if (fakeRoot.right == null){
//                    //fakeRoot left & right = null
//                    visit(treeStack.pop());
//                    fakeRoot = fakeRoot;
//                }else {
//                    //fakeRoot left==null right != null
//                    treeStack.push(fakeRoot.right);
//                }
//
//            }

            /*
            * 假设右孩子为空，那么出栈，然后新的栈顶元素变成了另一个元素。也即是fakeRoot。
            * */



        }




    public static void visit(MyTree node){
        if (node != null)
        System.out.println("[ " + node.val + " ]");
    }
}