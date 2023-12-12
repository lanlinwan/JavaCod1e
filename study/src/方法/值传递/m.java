package 方法.值传递;

import 方法.方法引用.Student;

public class m {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("lan");
        zhi(student);
        System.out.println(student.getName());

    }

    //java中只有值传递,java是对传进来的参数进行了一份拷贝,所有的操作都是对这个副本进行,
    //引用类型作为参数,也是拷贝了一份引用的地址,对这个地址内的内容进行修改就会影响原来的内容
    //但是如果将这个副本去 = 另外一份地址 ,那对这个副本的使用将不再对原来的内容有影响
    private static void zhi(Student student) {
        student=new Student();
        student.setName("兰");

    }

}
