package 集合.单例集合.list集合.LinkedList集合;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList list= new LinkedList<>();
        list.add(1);
        list.add(2);

        System.out.println(list.get(0));

    }
    //LinkedList集合
    //底层数据结构是双链表，查询慢，首尾操作的速度是极快的，所以多了很多首尾操作的特有APl。
    //与 ArrayList 相比，LinkedList 的增加和删除 在头尾的操作效率更高，而查找和修改的操作效率较低。

    //特有方法
    //说明
    //public void addFirst(E e) 在该列表开头插入指定的元素
    //public void addLast(E e)  将指定的元素追加到此列表的末尾
    //public E getFirst()       返回此列表中的第一一个元素
    //public E getLast()        返回此列表中的最后- -个元素
    //public E removeFirst()    从此列表中删除并返回第一个元素
    //public E removeLast()     从此列表中删除并返回最后一-个元素x


    //面试:
    //ArrayList vs LinkedList
    //●ArrayList
    //①基于数组， 需要连续内存
    //②随机访问快 ,(指根据下标访问,因为是连续内存,很容易就可以计算到下一个元素地址值)
    //③尾部 插入删除性能可以，其它部分插入、删除都会移动数据,如果触发扩容
    //  扩容机制:因为数组长度固定,超出长度存数据时需要新建数组，然后将老数组的数据拷贝到新数组,因此性能会低
    //  使用尾插法并指定初始容量可以极大提升性能、甚至超过linkedList (需要创建天量的node对象)
    //④可以利用 cpu缓存，局部性原理,提升相邻元素被访问机会



    //●LinkedList
    //①基于双向链表， 无需连续内存
    //②随机访问慢 (要沿着链表遍历)
    //③头尾插入删除性能高( 中间位置操作 要耗费大量时间去 遍历到目标位置)
    //④占用 内存多
}
