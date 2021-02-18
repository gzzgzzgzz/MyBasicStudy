package linearTable._01_sequenceList;

public class _2_ {
    public static void main(String[] args) {
        SqList<Integer> sqList = new SqList<>(100);
        sqList.InitList(sqList);
        sqList.ListInsert(sqList,1,1);
        sqList.ListInsert(sqList,2,4);
        sqList.ListInsert(sqList,3,3);
        sqList.ListInsert(sqList,4,2);
        sqList.ListInsert(sqList,5,5);
        sqList.ListInsert(sqList,6,6);
        //sqList.ListInsert(sqList,7,7);
        int hall = sqList.getLength() - 1;
        for (int i = 0; i < sqList.getLength(); i++) {
            int temp = (int) sqList.getData()[i];
            sqList.getData()[i] = sqList.getData()[hall - i];
            sqList.getData()[hall - i] = temp;
            if ((i + 1) == sqList.getLength()/2){
                break;
            }
        }
        sqList.PrintList(sqList);
    }
}
