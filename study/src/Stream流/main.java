package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
/*
        单列集合      default Stream<E> stream()                           Collection中的默认方法
        双列集合      无                                                   无法直接使用stream流
        数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
        一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法
*/

        //1.单列集合获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "序列化","b","c","d","e");
        /*//获取到一条流水线，并把集合中的数据放到流水线上
        Stream<String> stream1 = list.stream();
        //使用终结方法打印一下流水线上的所有数据
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s:依次表示流水线上的每一个数据
                System.out.println(s);
            }
        });*/
        list.stream().forEach(s -> System.out.println(s));
        //Stream.of(list).forEach(s -> System.out.println(s));

        //双列集合      无                                                   无法直接使用stream流
        //2.创建双列集合
        HashMap<String,Integer> hm = new HashMap<>();
        //2.1 添加数据
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        //2.2 第一种获取stream流
        //hm.keySet().stream().forEach(s -> System.out.println(s));

        //2.3 第二种获取stream流
        hm.entrySet().stream().forEach(s-> System.out.println(s));



        //3. 数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
        //3.1 创建数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        String[] arr2 = {"序列化","b","c"};

        //3.2 获取stream流
        // Arrays.stream(arr1).forEach(s-> System.out.println(s));
        //System.out.println("============================");

        //Arrays.stream(arr2).forEach(s-> System.out.println(s));
        //System.out.println("============================");

        //注意：
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        //但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream当中。
        Stream.of(arr1).forEach(s-> System.out.println(s));//[I@41629346



        //4 一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法

        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        Stream.of("序列化","b","c","d","e").forEach(s-> System.out.println(s));




    }
}
