package 常用api.泛型;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
    //没有泛型的时候，集合如何存储数据
    //结论:
    //如果我们没有给集合指定类型，默认认为所有的数据类型都是0bject类型
    //此时可以往集合添加任意的数据类型。
    //带来一个环处:我们在获取数据的时候，无法使用他的特有行为。
    //且数据类型不确定无法进行强转
    //此时推出了泛型，可以在添加数据的时候就把类型进行统一。
        //1.创建集合的对象
        ArrayList list = new ArrayList();
        //2.添加数据
        list.add(123);
        list.add("aaa");
        //3.遍历集合获取里面的每- -个元素
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object str= it.next();
        //多态的弊端是不能访问子类的特有功能
            //it.length();
        //str .length();
            System.out.println(str);

        }


        //ArrayList<E>:其实就是一个泛型类,可在编译阶段约束集合对象只能操作某种数据类型
        //-----泛型类集合只能存储引用类型,不支持基本数据类型-----
        //Java中的泛型是伪泛型

        //ArrayList<String>: 此集合只能操作 字符串类型的元素
        ArrayList<String> a=new ArrayList<>();
        //ArrayList<int> a=new ArrayList<>();
        a.add("lan");


        //泛型的好处:
        //1. 统一数据类型
        //2. 把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，
        //   因为在编译阶段类型就能确定下来。
        //泛型的细节:
        //1. 泛型中不能写基本数据类型
        //2. 指定泛型的具体类型后，传递数据时，可以传入该类型和他的子类类型
        //3. 如果不写泛型，类型默认是Object

        //Java中的泛型是伪泛型:
        //泛型擦除（这是面试考察泛型时经常问到的问题）
        //Java的泛型基本上都是在编译器这个层次上实现的，在生成的字节码中是不包含泛型中的类型信息的，
        // 使用泛型的时候加上类型参数，在编译器编译的时候会去掉，这个过程成为类型擦除。






    }
}