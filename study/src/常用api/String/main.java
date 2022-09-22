package 常用api.String;
//String 变量每次修改其实都是 产生并指向新的字符串对象
//原来的字符串对象都是没有改变的,所以称为不可变字符串

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
