package 常用api.Lambda表达式;



import java.util.Arrays;
import java.util.Comparator;

public class main {
    //原写法
//    Integer[] arr1={23,12,12,66,95,45,83,26};
//        Arrays.sort(arr1,new Comparator<Integer>(){
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return o1-o2;
//        }
//    });
//        System.out.println(arr1[0]);

    //Lambda表达式:
    //函数式编程
    //函数式编程( Functional programming) 是一种思想特点。
    //函数式编程思想，忽略面向对象的复杂语法，强调做什么，而不是谁去做。
    //而我们要学习的Lambda表达式就是函数式思想的体现。

    public static void main(String[] args) {
        Integer[] arr1={23,12,12,66,95,45,83,26};

        Arrays.sort(arr1,(Integer o1,Integer o2)->{
                return o1-o2;
            }
        );
        System.out.println(arr1[0]);


        //注意点:
        //●Lambda表达式可以用来简化匿名内部类的书写
        //●Lambda表达式只能简化函数式接口的匿名内部类的写法
        //●函数式接口:
        //有且仅有一-个抽象方法的接口叫做函数式接口，接口.上方可以加@FunctionalInterface注解
        method(
                ()->{
                    System.out.println("666");
                }
        );


    }

    public static void method(Swim s){
        s.swimming();
    }
}
@FunctionalInterface
interface Swim{
    public abstract void swimming();
}