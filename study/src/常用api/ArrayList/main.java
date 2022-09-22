package 常用api.ArrayList;
//集合与数组类似,也是一种容器,用于装数据
//集合大小不固定,启动后可以动态变化,类型也可以选择不固定
//ArrayList 是集合中的一种,支持索引

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
