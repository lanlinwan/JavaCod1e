package 常用api.泛型.泛型通配符;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //泛型不具备继承性,但是数据具备继承性
        ArrayList<ye> list1 = new ArrayList<>();
        ArrayList<fu> list2 = new ArrayList<>();
        ArrayList<zi> list3 = new ArrayList<>();

        method(list1);
        method(list2);
        //method(list3);
    }

    /**
     * 此时，泛型里面写的是什么类型，那么只能传递什么类型的数据。
     * 弊端:
     * 利用泛型方法有一一个小弊端，此时他可以接受任意的数据类型
     * Ye Fu Zi Student
     * 希望:本方法虽然不确定类型，但是以后我希望只能传递 Ye Fu Zi
     * 此时我们就可以使用泛型的通配符:
     * ?也表示不确定的类型 他可以进行类型的限定
     * ? extends E:表示可以传递E或者E所有的子类类型
     * ? super E:表示可以传递E或者E所有的父类类型
     * 应用场景:
     * 1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口。
     * 2.如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以泛型的通配符
     * 泛型的通配符:
     * 关键点:可以限定类型的范围。
     */
    public static <E> void method(ArrayList<? super fu> list) {

    }
}

class ye {
}

class fu extends ye {
}

class zi extends fu {
}

class student {
}