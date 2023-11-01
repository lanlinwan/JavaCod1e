package 常用api.String;
//String 变量每次修改其实都是 产生并指向新的字符串对象
//原来的字符串对象都是没有改变的,所以称为不可变字符串

//不可变性的好处:
//1.可以缓存 hash 值（）
//因为 String 的hash值经常被使用，例如String 用做 HashMap 的 key。不可变的特性可以使得 hash值也不可变， 因此只需要进行一次计算。
//2.常量池优化
//String 对象创建之后，会在字符串常量池中进行缓存，如果下次创建同样的对象时，会直接返回缓存的引用。
//3.线程安全
//String 不可变性天生具备线程安全，可以在多个线程中安全地使用。


//什么是字符串常量池？＊
//字符串常量池位于堆内存中，专门用来存储字符串常量，可以提高内存的使用率，避免开辟多块空间存储相同的字符串，
// 在创建字符串时 JVM 会首先检查字符串常量池，如果该字符串已经存在池中，则返回它的引用，
// 如果不存在，则实例化一个字符串放到池中，并返回其引用。
public class main {
    public static void main(String[] args) {
        //1.直接使用双引号得到字符串对象
        String s="lan";
        //2.public String() 创建一个空字符串对象(几乎不用)
        String s1=new String();
        //3.public String(String) 根据传入的内容创建字符串对象(几乎不用)
        String s2=new String("LAN");
        //4.public String(char[] b);  根据字符数组内容 创建字符串对象
        char[] chars={'l','a','b'};
        String s3=new String(chars);
        System.out.println(s3);
        //4.public String(byte[] b);  根据字节数组内容 创建字符串对象
        byte[] bytes={97,98,99};
        String s4=new String(bytes);
        System.out.println(s4);
        System.out.println("---------------------");
//注意:以 "" 方式定义的会在 字符串常量池中(栈内存)存储,相同内容只存储一份
//    以构造器 new对象,每new一下都会产生一个新对象,放在堆内存
        String s5="本";
        String s6="本";
        System.out.println(s5==s6);//true

        char[] c={'a', 'b', 'c'};
        String s7=new String(c);
        String s8=new String(c);
        System.out.println(s7==s8);//false



    }
}
