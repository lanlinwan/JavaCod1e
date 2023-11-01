package 集合.单例集合.遍历;

import java.util.ArrayList;
import java.util.Collection;

public class 增强for遍历 {
    public static void main(String[] args) {
        //增强for的底层就是迭代器，为了简化迭代器的代码书写的。
        //它是JDK5之后出现的，其内部原理就是一-个Iterator迭代器
        //所有的单列集合和数组才能用增强for进行遍历。

        Collection<String> coll = new ArrayList<>();
        coll.add("lan");
        coll.add("ben");
        coll.add("cai");
        coll.add("lbc");
        //利用增强for遍历:
        // s 就是一个第三方变量,在循环过程中依次表示集合中的每一个数据
        // 修改增强for的变量,不会修改集合原本的数据
        for (String s:coll){
            System.out.println(s);
            //s="q";
        }



    }
}
