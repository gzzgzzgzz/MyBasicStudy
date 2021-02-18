package tree._1_what_is_a_tree;

import lombok.AllArgsConstructor;
import lombok.Data;

public class TreeDefination {


    public static void main(String[] args) {
//        Node node2 = new Node(2,new Node(4,null,null),new Node(5,null,null));
//        Node node3 = new Node(3,new Node(6,node2,null),new Node(7,null,null));
        Node node2 = new Node(2,null,null);
        Node node3 = new Node(3,null,null);
        Node root = new Node(1,node2,node3);
        tracer(root);
    }
    public static void tracer(Node root){
        if (root == null) return;
        System.out.println(root.value);
        tracer(root.left);
            tracer(root.right);

    }
}
@Data
@AllArgsConstructor
class Node{
    int value;
    Node left;
    Node right;
}
@Data
@AllArgsConstructor
class Node2{
    int value;
    Node[] nodes;
}