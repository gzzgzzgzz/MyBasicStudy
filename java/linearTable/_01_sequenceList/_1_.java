package linearTable._01_sequenceList;

public class _1_ {

    public static void main(String[] args) {


        //思路1
        //1，遍历所有元素，找出最小的元素和它的索引
        //2，调用根据位置删除的方法
        //O(n) + O(n)

        //思路2
        //1，遍历所有元素，找出最小的元素和它的索引
        //2，在找出最小的元素和它的索引的同时把最后一个元素的值交换
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
        if (sqList == null) return;
        int minIndex = 0;//最小值索引
        int min =  sqList.GetElem(sqList,1);//最小值

        for (int i = 0; i < sqList.getLength(); i++) {
            if (sqList.GetElem(sqList,i + 1) < min){
                minIndex = i;
            }
        }
        if (minIndex != -1){
            //存在最小值
            sqList.getData()[minIndex] = sqList.getData()[sqList.getLength() - 1];
            sqList.setLength(sqList.getLength() - 1);
        }
        sqList.PrintList(sqList);

    }
}
