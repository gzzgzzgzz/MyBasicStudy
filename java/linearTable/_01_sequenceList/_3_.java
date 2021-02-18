package linearTable._01_sequenceList;

public class _3_ {
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
        int x = 3;
        for (int i = 0; i < sqList.getLength(); i++) {
            if ((int)sqList.getData()[i] == x){
                sqList.getData()[i] = sqList.getData()[sqList.getLength() - 1];
                sqList.setLength(sqList.getLength() - 1);
            }
        }
        sqList.PrintList(sqList);
    }
}
