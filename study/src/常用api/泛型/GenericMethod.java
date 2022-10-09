package 常用api.泛型;

import java.util.ArrayList;

public class GenericMethod {
    //泛型方法:
    // 方法中形参类型不确定时,可以使用类名后面定义的泛型<E>(所有方法都可以使用)
    // 也可以使用 在方法上声明定义的泛型(本方法都可以使用)


    //添加多个元素
    public static <E> void addAll(ArrayList<E> list,E...e){
        for (E element:e){
            list.add(element);
        }
    }


}
