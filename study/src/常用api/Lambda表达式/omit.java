package 常用api.Lambda表达式;

import java.util.Arrays;

public class omit {
    public static void main(String[] args) {
        /*
        lambda的省略规则:
        1.参数类型可以省略不写。
        2.如果只有一一个参数， 参数类型可以省略，同时()也可以省略。
        3.如果Lambda表达式的方法体只有一-行，大括号，分号，return可以省略不写，需要同时省略。
    */


    Integer[] arr={23,12,12,66,95,45,83,26};

//        Arrays.sort(arr,new Comparator<Integer>(){
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return o1-o2;
//        }
//    });

        //lambda完整格式
        Arrays.sort(arr,(Integer o1,Integer o2)->{
            return  o1-o2;
        });

        //lambda省略写法
        Arrays.sort(arr,(o1,o2) -> o1-o2);

        System.out.println(arr[0]);


    }
}
