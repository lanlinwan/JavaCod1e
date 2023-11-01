package 方法.方法引用.ex;

import 方法.方法引用.Student;

import java.util.ArrayList;
import java.util.Collections;

public class ex1 {
    public static void main(String[] args) {
        //集合存储 字符串数据,收集到 Student类型中的数组中

        //创建集合 并添加元素
        ArrayList<String> list= new ArrayList<>();
        Collections.addAll(list,"兰,18","澜,19","蓝,20","朗,21","岚,22","琅,23");

        //将字符串变为Student对象并收集起来
        Student[] arr=list.stream().map(Student::new).toArray(Student[]::new );
        System.out.println(arr);
    }

}
