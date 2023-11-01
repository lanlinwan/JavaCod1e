package 集合.单例集合.list集合.ArrayList.ex;

import java.util.ArrayList;



//
public class ex {
    public static void main(String[] args) {
        //1. 98,77,66,89,79,50,100
        //删除低于80的
        ArrayList<Double> list=new ArrayList<>();
        list.add(98.0);
        list.add(77.0);
        list.add(66.0);
        list.add(89.0);
        list.add(79.0);
        list.add(50.0);
        list.add(100.0);
        System.out.println(list);
        //1.
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <80){
                list.remove(i);
                i--;//注意:删除后后一个元素会填补位置,需要将索引往前移一位
            }
        }
        System.out.println(list);

        //2.倒叙删除 不会出现补位现象
        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i) <80){
                list.remove(i);
            }
        }
        System.out.println(list);


    }
}
