package 集合.单例集合.Set集合.HashSet;

public class dichen {
    public static void main(String[] args) {
        //HashSet 底层 创建了一个 HashMap,所以底层与HashMap基本相似

        //HashSet 底层原理
        //1. HashSet集合底层采取 哈希表 存储数据
        //2. 哈希表是一种对于增删改查数据性能都比较好的结构

        //哈希表组成
        //JDK8之前: 数组 + 链表
        //JDK8之后: 数组 + 链表 + 红黑树

        //①创建一个默认长度16，默认加载因为0.75的数组,数组名table
        //②根据元素的哈希值 跟数组的长度计算出应存入的位置
        //③判断当 前位置是否为null,如果是null直接存入
        //④如果位置不为null, 表示有元素，则调用equals方法比较属性值
        //⑤一样:不存
        //不一样:存入数组，形成链表
        //JDK8以前:新元素存入数组，老元素挂在新元素下面
        //JDK8以后:新元素直接挂在老元素下面
        //        且当链表长度超过 8 ,而且数组长度大于 64时会自动转换为 红黑树

        //集合中存储的是自定义对象,必须要重写 hashCode,equals 方法
        //否则会对他的 地址值 进行hashCode,equals运算
    }


}
