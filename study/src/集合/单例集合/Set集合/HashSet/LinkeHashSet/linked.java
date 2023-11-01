package 集合.单例集合.Set集合.HashSet.LinkeHashSet;

import java.util.LinkedHashSet;

public class linked {
    public static void main(String[] args) {
        //LinkedHashSet底层原理: 创建一个LinkedHashMap
        //有序、不重复、无索引。
        //●这里的有序指的是保证存储和取出的元素顺序- -致
        //原理:底层数据结构是依然哈希表,只是每个元素又额外的多了-一个双链表的机制记录存储的顺序。

        Student s1=new Student("lan",20);
        Student s2=new Student("l",20);
        Student s3=new Student("a",20);
        Student s4=new Student("lan",20);

        //创建集合对象
        LinkedHashSet<Student> lhs =new LinkedHashSet<>();

        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s4));
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s3));

        System.out.println(lhs);
    }

}
