package 集合.单例集合.遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class lambda表达式遍历 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("lan");
        coll.add("ben");
        coll.add("cai");
        coll.add("lbc");
        //匿名内部类:
        //s代表每一个2元素
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //利用lambda表达式遍历进行遍历
        coll.forEach(s -> System.out.println(s));
    }

    public static class main {
    }
}
