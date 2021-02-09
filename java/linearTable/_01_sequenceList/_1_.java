package linearTable._01_sequenceList;

public class _1_ {
    public static void main(String[] args) {
        //思路1
        //1，遍历所有元素，找出最小的元素和它的索引
        //2，调用根据位置删除的方法
        //O(n) + O(n)

        //思路2
        //1,采用一种高效的策略将线性表进行排序
        //2，调用根据位置删除的方法
        //O(排序算法的时间复杂度) + O(n)

        //思路3
        //1，遍历所有元素，找出最小的元素和它的索引
        //2，在找出最小的元素和它的索引的同时把最后一个元素的值直接覆盖
        //同时将顺序表的长度缩小1
        //O(n)

        //思路4
        //1,采用一种高效的策略将线性表进行排序
        //2，在找出最小的元素和它的索引的同时把最后一个元素的值直接覆盖
        //同时将顺序表的长度缩小1
        //O(排序算法的时间复杂度)
    }
}
