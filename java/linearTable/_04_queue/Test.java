package linearTable._04_queue;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Test {
    public static void main(String[] args) {
       // Node node2 = new Node(2,new Node(4,null,null),new Node(5,null,null));
        Node node2 = new Node(2,null,new Node(4,null,null));
        Node node3 = new Node(3,null,null);
        Node root = new Node(1,node2,node3);
        String serialize = serialize(root);
        System.out.println(serialize);
    }

//    public static Node reverseSerialize(String serializeChars){
//    }

    public static String serialize(Node root){
        if (root == null){return "#";}
        String left = serialize(root.left);
        String right = serialize(root.right);
        String subTree = left + "," + right + "," + root.value;
        return subTree;
    }
}
@Data
@AllArgsConstructor
class Node{
    int value;
    Node left;
    Node right;
}