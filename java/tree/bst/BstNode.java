package tree.bst;

public class BstNode {
    BstNode left;
    BstNode right;
    int val;
    public BstNode(int val){
        this.val = val;
    }

    boolean isBst(BstNode root){
        return isBst(root,null,null);
    }

    //is this tree is BST
    boolean isBst(BstNode root,BstNode min,BstNode max){
        if (root == null) return true;
        if (min != null && min.val > root.val) return false;
        if (max != null && max.val < root.val) return false;
        return isBst(root.left,min,root) && isBst(root.right,root,max);
    }
    int time = 0;
    boolean isExits(BstNode root,int val){
        if (root == null) return false;
        ++time;
        System.out.println("time:" + time);
        if (root.val == val) return true;
        return isExits(root.left,val) || isExits(root.right,val);
    }
    int time2 = 0;

    boolean isExits2(BstNode root,int val){
        if (root == null) return false;
        ++time2;
        System.out.println("time2:" + time2);
        if (root.val == val) return true;
        else if (root.val < val){
            return isExits2(root.right,val);
        }else{
            return isExits2(root.left,val);
        }
    }

    void bstTracer(BstNode root,int val){
        if (root == null) return;
        //do some thing
        //finded target
        if (root.val < val)  bstTracer(root.right,val);
        if (root.val > val) bstTracer(root.left,val);
    }


    public static void main(String[] args) {
        BstNode n1 = new BstNode(3);
        BstNode n2 = new BstNode(1);
        BstNode n3 = new BstNode(5);
        BstNode n4 = new BstNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        BstNode b = new BstNode(0);

        //System.out.println(b.isBst(n1));

        System.out.println(b.isExits(n1, 2));
        System.out.println(b.isExits2(n1, 2));

    }
}
