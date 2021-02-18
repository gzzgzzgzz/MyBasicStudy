package linearTable._01_sequenceList;

public class _1_ {
    public static void main(String[] args) {
        //思路1
        //1，遍历所有元素，找出最小的元素和它的索引
        //2，调用根据位置删除的方法
        //O(n) + O(n)

        //思路2
        //1，遍历所有元素，找出最小的元素和它的索引
        //2，在找出最小的元素和它的索引的同时把最后一个元素的值直接覆盖
        //同时将顺序表的长度缩小1
        //O(n)
        SqList<Integer> sqList = new SqList<>(100);
        sqList.InitList(sqList);
        sqList.ListInsert(sqList,1,1);
        sqList.ListInsert(sqList,2,4);
        sqList.ListInsert(sqList,3,3);
        sqList.ListInsert(sqList,4,2);
        sqList.ListInsert(sqList,5,5);
        sqList.ListInsert(sqList,6,6);
        for (int i = 0; i < sqList.Length(sqList); i++) {
        }

    }
}
