package 常用api.String.字符串拼接底层原理;

public class main {
    public static void main(String[] args) {
        String s1="a";

        //字符串拼接如果有变量:
        //JDK8之前: 底层利用了 StringBuilder 进行拼接 并使用 toString 返回字符串(至少创建两个对象)
        //         但每拼接一次就会创建一次StringBuilder对象,占内存
        //JDK8之后:进行长度预估创建数组放入再转化为字符串,此时也产生一个新的字符串
        String s2=s1+"b";
        String s3=s2+"c";
        System.out.println(s3);


    }
}
