package tree._2_leetCode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Builder
public class _94 {
    ArrayList<Integer> ans = null;
    public List<Integer> inOrder(TreeNode root){
        if (root == null) {
            return ans;
        }
        inOrder(root.getLeft());
        ans.add(root.getVal());
        inOrder(root.getRight());
        return ans;
    }

    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2,new TreeNode(4,null,null),new TreeNode(5,null,null));
        TreeNode node3 = new TreeNode(3,new TreeNode(6,null,null),new TreeNode(7,null,null));
        TreeNode node = new TreeNode(1,node2,node3);
        _94 build = _94.builder().build();
        build.ans = new ArrayList<>();
        build.inOrder(node);
    }//4251637
}
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
   class TreeNode {
      private int val;
      private TreeNode left;
      private TreeNode right;

  }
