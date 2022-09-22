package 面向对象.封装;

public class main {
//    封装原则:对象代表什么,就得封装对应的数据,并提供数据对应的行为
public static void main(String[] args) {
    Student s=new Student();
    s.setAge(33);
    System.out.println(s.getAge());
}


}
