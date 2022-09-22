package 常用api.包装类;

public class main {
    public static void main(String[] args) {
        //包装类:基本数据类型对应的引用类型
        //      用一个对象,把基本数据类型给包起来

        //public Integer(int value) 根据传递的整数创建一个Integer对象
//        Integer i=new Integer(55);
        //public Integer(String s) 根据传递的字符串创建一个Integer对象
//        Integer i1=new Integer("55");
        //public static Integer valueOf(int i) 根据传递的整数创建一个Integer对象
        Integer i2 = Integer.valueOf(127);
        //public static Integer valueOf(String s) 根据传递的字符串创建一个Integer对象
        Integer i3 = Integer.valueOf("127");
        //public static Integer valueOf(String s, int radix)根据传 递的字符串和进制创建一个Integer对象


        //注意:这两种方式获取对象的区别(掌握)
        //底层原理: |
        //因为在实际开发中，-128~127之 间的数据，用的比较多。
        //如果每次使用都是new对象，那么太浪费内存了
        //所以，提前把这个范围之内的每--个数据都创建好对象
        //如果要用到了不会创建新的，而是返回已经创建好的对象。

        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);//true
        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);//false
        //因为看到了new关键字，在Java中， 每一次new都是创建了一个新的对象
        //所以下面的两个对象都是new出来，地址值不- -样。
//        Integer i10 = new Integer(127);
//        Integer i11 = new Integer(127);
        //System. out.println(i10 == i11);//false
//        Integer i12 = new Integer(128);
//        Integer i13 = new Integer(128);
        //System. out.print1n(i12 == i13);//false




















    }
}
