package tree.leveliterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L {


    public static void main(String[] args) {
        //层序遍历
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        L l = new L();
        l.tracer2(root);
    }


    public void tracer(TreeNode root){
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while (!q.isEmpty()){
            TreeNode curr = q.poll();

            if (curr.left != null){
                q.offer(curr.left);
            }
            if (curr.right != null){
                q.offer(curr.right);
            }
        }
    }

    public void tracer2(TreeNode root){
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while (!q.isEmpty()){
            TreeNode curr = q.poll();

            if (curr == null) continue;

            System.out.println(curr.val);

            q.offer(curr.left);
            q.offer(curr.right);

        }
    }


}
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
