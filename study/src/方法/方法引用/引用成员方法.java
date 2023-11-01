package 方法.方法引用;

import java.util.ArrayList;
import java.util.Collections;

public class 引用成员方法 {
    public static void main(String[] args) {
        /*
        方法引用（引用成员方法）
        格式
                1.其他类：其他类对象::方法名
                2.本类：this::方法名(不能在静态方法中使用)
                3.父类：super::方法名(不能在静态方法中使用)
      4.类名引用成员方法: 类名::成员方法
             不能引用所有类中的成员方法
             如果抽象方法的第一个参数是A类型的
             只能引用A类中的方法

        使用技巧:
                1.现在是否有一个方法符合要求
                2.这个方法是否满足引用规则
                 静态    类名:: 方法名
                 构造方法 类名::new
                 成员方法(难点):1.需要的方法在 处理的数据对象中:类名::方法
                             2.需要的方法在 其他类中: 对象名::方法名
                             3.在本类 或者 父类, this(super)::方法名
*/

        /*
        需求：
            集合中有一些名字，按照要求过滤数据
            数据："张无忌","周芷若","赵敏","张强","张三丰"
            要求：只要以张开头，而且名字是3个字的


       */

        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        //3.过滤数据（只要以张开头，而且名字是3个字的）
        //list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s-> System.out.println(s));


      /*  list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length() == 3;
            }
        }).forEach(s-> System.out.println(s));*/

      /*  StringOperation so = new StringOperation();
        list.stream().filter(so::stringJudge)
                .forEach(s-> System.out.println(s));*/

        //静态方法中是没有this的
        list.stream().filter(new 引用成员方法()::stringJudge)
                .forEach(s-> System.out.println(s));



    }


     public boolean stringJudge(String s){

         return s.startsWith("张") && s.length() == 3;
    }

}
