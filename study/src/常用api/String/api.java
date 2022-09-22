package 常用api.String;

import java.util.Scanner;

public class api {
    public static void main(String[] args) {
        String name="lan";
        String word="123";

        Scanner s=new Scanner(System.in);
        System.out.println("登录名称");
        String na=s.next();
        System.out.println("密码");
        String w=s.next();


        //1.判断 内容是否 相等
        if(name.equals(na)&&word.equals(w)){
            System.out.println("登陆成功");
        }else {
            System.out.println("错误");
        }

        //2.忽略大小写比较 验证码 符合逻辑
        String n="lan,ben";
        String wo="LAN,BEN";
        System.out.println(n.equals(wo));//false
        System.out.println(n.equalsIgnoreCase(wo));//true

        //3.返回字符串的长度  length()
        System.out.println(n.length());// 7

        //4.获取某个索引位置处的字符 charAt(int)
        System.out.println(n.charAt(3)); // ,

        //5.根据开始与结束索引截取,得到新字符串(不包括后) substring(int,int)
        System.out.println(n.substring(1,3));// an

        //6.从传入的索引处,截取到末尾,得到新的字符串  substring(int)
        System.out.println(n.substring(2));// n,ben

        //7.使用新值,将字符串中的旧值替换,得到新的字符串  replace(string,string)
        System.out.println(n.replace("lan","Lan"));// Lan,ben

        //8.根据传入的规则切割字符串,得到字符串数组返回
        String[] bb=n.split(",");
        for (int i = 0; i < bb.length; i++) {
            System.out.println(bb[i]);
        }// lan  ben

        //9查找其中是否有 含需要查找的值
        System.out.println(n.contains("lan"));//true

    }
}
