package 语法.枚举;

import java.util.Arrays;

public class m {
    public static void main(String[] args) {
        //枚举的常见应用场景:
        //●用来表示一-组信息，然后作为参数进行传输。
        // 选择定义一个-一个的常量来表示一-组信息， 并作为参数传输
        //●参数值不受约束。
        // 选择定义枚举表示一组信息，并作为参数传输
        //●代码可读性好，参数值得到了约束，对使用者更友好,建议使用!
        myenum m=myenum.AUTUMN;
        System.out.println(m);
        myenum[] mm= myenum.values();
        System.out.println(Arrays.toString(mm));

        System.out.println(myenum.valueOf("AUTUMN"));

        //做信息标志和分类
        check(myenum.AUTUMN);
    }

    private static void check(myenum myenum) {
        switch (myenum){
            case AUTUMN:
                System.out.println("AUTUMN");
                break;
            case  SPRING:
                System.out.println("SPRING");
                break;
            case  SUMMER:
                System.out.println("SUMMER");
                break;
            case  WINTER:
                System.out.println("WINTER");
                break;
        }
    }
}
