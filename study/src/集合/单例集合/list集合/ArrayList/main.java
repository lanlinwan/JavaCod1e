package 集合.单例集合.list集合.ArrayList;
//集合与数组类似,也是一种容器,用于装数据
//集合大小不固定,启动后可以动态变化,类型也可以选择不固定
//ArrayList 是集合中的一种,支持索引 增删慢,查询快

//add扩容规则: ArrayList 初始化 容量为0,第一次添加元素扩容为10,后续装不下 扩容当前容量1.5倍(向下取整)
//addAll扩容规则: addAll(Collection c) 数组内没有元素时，扩容为Math.max(10,实际元素个数),
//              有元素时为Math.max(原容量1.5倍,实际元素个数)

//理论扩容容量:
//[0,10,15,22,33,49,73,109,163,244,366,549,823,1234,1851,2776,4164,6246,9369,14053,21079]

//jdk1.7：当实例化ArrayList时，创建长度为10的object[ ] ;当add添加到11个的时候，扩容，
// 扩容为原来的1.5倍。将原来的数据复制到新的数组中。建议使用new ArrayList(int capacity)直接声明数组的大小；
//jdk1.8：当实例化是，创建object[] ,初始化为 {}，并没有长度。
// 当添加第一个元素时，创建长度为10的数组。后续一致。
// 1.7类似，饿汉式  1.8类似，懒汉式
// 1.8的优点：延迟数组的创建，节省内存

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //创建ArrayList  对象
        ArrayList  a=new ArrayList();
        //1.添加数据
        a.add(11);
        a.add("lan");
        a.add('中');



        System.out.println(a);
        //2.指定索引位置插入元素
        a.add(1,66);
        System.out.println(a);

    }
}
