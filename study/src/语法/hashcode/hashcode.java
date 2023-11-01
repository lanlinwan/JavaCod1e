package 语法.hashcode;

public class hashcode {
    public static void main(String[] args) {
        //HashCode的意义:
        //HashMap插入重复的key，HashSet插入重复的value，,其value会被覆盖掉，那么，就有一个问题，他们怎么来判断重复呢？
        // 假设数据量庞大，每次插入要进行的判断重复操作就会非常耗时。据了解，他们判断两个对象是否相等的规则是：
        //(1)首先判断两个对象的hashCode是否相等
        //如果不相等，认为两个对象也不相等，完毕
        //如果相等，转入2）
        //(2)判断两个对象用equals运算是否相等
        //如果不相等，认为两个对象也不相等
        //如果相等，认为两个对象相等（equals()是判断两个对象是否相等的关键）

        // hashCode 与  equals
        //●如果两个对象相等,则hashcode- 定也是相同的
        //●两个对象相等,对两个对象分别调用equals方法都返回true
        //●两个对象有相同的hashcode值，它们也不一定是相等的
        //●因此，equals方法被覆盖过, 则hashCode方法也必须被覆盖
        //●hashCode()的默认行为是对堆上的对象产生独特值。如果没有重写hashCode(),则该class的两 个对象无论如
        //何都不会相等(即使这两个对象指向相同的数据)
    }
}
