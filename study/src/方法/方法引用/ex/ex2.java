package 方法.方法引用.ex;

import 方法.方法引用.Student;

import java.util.ArrayList;
import java.util.function.Function;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
        list.add(new Student("蓝",19));
        list.add(new Student("兰",20));
        list.add(new Student("澜",21));

        //将 姓名放入数组中
//        String[] arr=list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                return student.getName();
//            }
//        }).toArray(String[]::new);

        //方法引用: 类名::成员方法
        String[] arr=list.stream().map(Student::getName).toArray(String[]::new);



    }
}
