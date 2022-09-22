package 常用api.ArrayList;

import java.util.ArrayList;

//ArrayList<E>:其实就是一个泛型类,可在编译阶段约束集合对象只能操作某种数据类型
//-----泛型类集合只能存储引用类型,不支持基本数据类型-----
public class ArrayList与泛型 {
    public static void main(String[] args) {
        //ArrayList<String>: 此集合只能操作 字符串类型的元素
        ArrayList<String> a=new ArrayList<>();
        a.add("lan");

    }
}
