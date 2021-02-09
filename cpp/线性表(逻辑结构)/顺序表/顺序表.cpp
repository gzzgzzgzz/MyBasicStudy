#include <iostream>
using namespace std;
#define ELEMTYPE int

typedef struct
{
    ELEMTYPE *data;//动态数组存放数据，这里有两个思路。1种采用分配好大小的数组，但是当满了后会产生内存泄露（操作系统）。
    //ELEMTYPE data[FIX_SIZE];
    int maxSize,length;//顺序表的最大大小和当前长度。
} SqlList;

//顺序表是线性表的顺序存储实现结构

//下面有一些对线性表的基本操作。--即接口
void InitList(&L);//初始化表
int Length(L);//求表长
ELEMTYPE* LocateElem(L,e);//按值找到对应元素地址
ELEMTYPE getElem(L,i);//按位找到元素
void ListInsert(&L,i,e);//按给定的位置插入元素
void ListDelete(&L,i,&e);//按给定的位置删除元素
void printList(L);
bool isEmpty(L);
void DestroyList(&L);
//




int main(){
    
    SqlList l;
    l.data = new ELEMTYPE[4];
    l.data[0]=1;
    
}