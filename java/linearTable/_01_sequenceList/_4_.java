package linearTable._01_sequenceList;

public class _4_ {
    public static void main(String[] args) {
        SqList<Integer> sqList = new SqList<>(100);
        sqList.InitList(sqList);
        sqList.ListInsert(sqList,1,1);
        sqList.ListInsert(sqList,2,4);
        sqList.ListInsert(sqList,3,3);
        sqList.ListInsert(sqList,4,2);
        sqList.ListInsert(sqList,5,5);
        sqList.ListInsert(sqList,6,6);
        sqList.ListInsert(sqList,7,3);
        sqList.ListInsert(sqList,8,4);
        sqList.ListInsert(sqList,9,4);
        //假设s,t是位置
        int s = 1;
        int t = 4;
        if (s >= t || s < 1 || t > sqList.getLength() || sqList.Empty(sqList)){
            return;
        }
        int step = t - s;
        for (int i = t - 1; i < sqList.getLength(); i++) {
            sqList.getData()[i - step] = sqList.getData()[i];
        }
        sqList.setLength(sqList.getLength() - step);
        sqList.PrintList(sqList);
    }
}
