package 常用api.泛型;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        //泛型类
        MyArrayList<Integer> list=new MyArrayList<>();
        list.add(15);
        list.add(18);
        list.add(19);
        
        int li=list.get(1);
        System.out.println(li);

        System.out.println(list);

        //泛型方法
        ArrayList<Integer> list5=new ArrayList<>();
        GenericMethod.addAll(list5,1,2,3,4,5);

        //泛型接口
        genericInterface i=new genericInterface();
        i.add(" 555");
        //i.add(55);

        genericInterface2<String> ii=new genericInterface2<>();
        ii.add(" 5555");
    }
}
