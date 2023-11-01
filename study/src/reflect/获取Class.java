package reflect;

import Exercise.homework.one;

public class 获取Class {

    public static void main(String[] args) throws ClassNotFoundException {
        //反射: 允许对成员变量,成员方法,构造方法进行编程访问
        //idea 代码提示 就是反射的作用

        //获取Class对象的三种方式:
        //1. Class.forName("全类名")
        //2. 类名.class
        //3. 对象.getClass();


        //1. 第一种方式
        //全类名 ： 包名 + 类名
        //最为常用的
        Class clazz1 = Class.forName("Exercise.homework.one");

        //2. 第二种方式
        //一般更多的是当做参数进行传递
        Class clazz2 = one.class;


        //3.第三种方式
        //当我们已经有了这个类的对象时，才可以使用。
        one s = new one();
        Class clazz3 = s.getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);

    }

}
