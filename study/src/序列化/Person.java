package 序列化;

import java.io.Serializable;

//        普通序列化:
//        Serializable接口是一个标记接口，不用实现任何方法。
//        一旦实现了此接口，该类的对象就是可序列化的。

//可选的自定义序列化
//    有些时候，我们有这样的需求，某些属性不需要序列化。使用transient关键字选择不需要序列化的字段。
public class Person implements Serializable {
    private String name;
    private int age;
    private transient int a;//不需要序列化

    //我不提供无参构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
