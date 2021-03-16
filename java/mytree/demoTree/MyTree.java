package mytree.demoTree;

import lombok.Data;

@Data
public class MyTree {
    MyTree left;
    MyTree right;
    int val;
    MyTree(int val){
        this.val = val;
    }
}
