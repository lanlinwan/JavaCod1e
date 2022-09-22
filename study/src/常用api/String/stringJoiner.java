package 常用api.String;

import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        //●StringJoiner跟StringBuilder- 样，也可以看成是一个容 器，创建之后里面的内容是可变的。
        //●作用:提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。
        //●JDK8出现的
        int[] arr = {1, 2, 3};
        //创建一个对象,并指定中间的间隔字符
        StringJoiner sj1 = new StringJoiner(", ");
        StringJoiner sj = new StringJoiner(", ", "[", "] ");
        for (int i = 0; i < arr.length; i++) {
            //add()     添加数据,并返回对象本身
            sj.add(arr[i] + "");
        }
        System.out.println(sj);

        //length()  返回长度(所有字符个数)
        System.out.println(sj.length());
        //toString()返回一个字符串(拼接后的结果)
        String s=sj.toString();
        System.out.println(s);

    }
}