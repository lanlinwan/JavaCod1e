package 集合.单例集合.list集合.ArrayList;

import java.util.ArrayList;

public class api {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("lan");
        list.add("ben");
        list.add("cai");
        list.add("LAN");
        list.add("蓝");

        //1.get(int);获取某个索引位置的元素值
        String s=list.get(3);
        System.out.println(s);
        System.out.println(list);

        //2.size():获取集合大小
        System.out.println(list.size());

        //3.完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //4.remove(int):删除某个索引位置的元素值,并返回
        String ss=list.remove(4);
        System.out.println(ss);

        //5.remove():直接删除元素值,c成功返回 ture,失败 false
        //---默认只删除 第一个找的的值---
        Boolean b=list.remove("lan");
        System.out.println(b);

        //6.set(int,E):修改某个索引位置的元素值,返回被删除的值
        String n= list.set(0,"lll");
        System.out.println(n);
        System.out.println(list);

        //7. addAll() 一次性添加
        ArrayList<String> list1=new ArrayList<>();
        list1.addAll(list);


    }
}
