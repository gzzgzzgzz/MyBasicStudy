package tree.huffman;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}

public class HuffmanTree {

    /*
    * 哈夫曼编码：
    * 电报通信，假设传输A,B,C,D四个字符。
    * 总共用2位ok，即00-A,01-B,10-C,11-D,假设传输AAAABACD，则需要2*8=14位。对方等长译码。
    * 你也看出，A出现频率最高，何不采用不等长译码，使A的编码尽可能的短。而D长一点无所谓。
    * 假设我们采用不等长的编码，1-A,11-B,10-C,00-D。则AAAABACD可以为11111111000.
    * 11111111000怎么翻译？即使我把1-A,11-B,10-C,00-D告诉对方，但是对方可能以为前面那么多个1就都是A,或者是B+A,或者都是B。或者是A+B+C.
    * 怎么办？
    *
    * */


    /*
    * 哈夫曼树生成算法：
    * 0，哈夫曼解决的是带"权"的二叉树的最优化问题。
    * 假设有一堆带权的节点，怎么把它构造成一个二叉树呢？
    * 1,选取最小的俩节点
    * 2,把他们的和放到他们头上，把他们俩删除
    * 3，把和放到堆中
    * 4，重复执行1，2，3
    * */



    public static void main(String[] args) {

        List<Integer> theseNodes = Arrays.stream("1,100,88,75,94,12,33,95,97,48,23".split(",")).map(Integer::valueOf).collect(Collectors.toList());

    }

}

























