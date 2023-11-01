package 常用api.String;


import java.util.Scanner;

public class api {
    public static void main(String[] args) {
        //contains
        //● int       length()              返回此字符串的长度
        //● boolean   equals(Object obj)    比较字符串的内容是否相同
        //● String[]  split(String regex)   将此字符串按给定的规则分割
        //● boolean   isEmpty()             判断是否是空字符串
        //● char      charAt(int index)     返回char指定索引|处的值
        //● int       indexOf(String str)   返回指定子字符串第一次出现的字符串内的索引
        //● int       indexOf(String str, int fromIndex)     返回指定子串的第一次出现的字符串中的索引，从指定的索引开始
        //● int       lastIndexOf(String str)                返回指定子字符串最后一次出现的字符串中的索引
        //● int       lastIndexOf(String str, int fromIndex) 返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始反向搜索
        //● String    toLowerCase()         将String中的所有字符转换为小写
        //● String    toUpperCase()         将String中的所有字符转换为大写
        //● boolean   startsWith(String prefix)              测试此字符串是否以指定的前缀开头
        //● boolean   startsWith(String prefix, int offset) 测试在指定索引处开始的此字符串的子字符串是否以指定的前缀开头
        //● boolean   endsWith(String suffix)               测试此字符串是否以指定的后缀结尾

        //● String    trim()                     返回-一个字符串，其值为此字符串，并删除任何前导和尾随空格
        //● String    concat(String str)         将指定的字符串连接到该字符串的末尾
        //● String    substring(int beginIndex)  返回-个字符串，该字符串是此字符串的子字符串
        //● String    substring(int beginIndex, last Index)根据开始与结束索引截取,得到新字符串(不包括后)
        //●int        compareTo(String anotherString)   按字典顺序比较两个字符串
        String name="lan";
        String word="123";
        Scanner s=new Scanner(System.in);
        System.out.println("登录名称");
        String na=s.next();
        System.out.println("密码");
        String w=s.next();



        byte a;

        //1、= = 基本数据类型和引用数据类型都可用
        //(1) = =左右两边的变量是基本数据类型,比值;
        //(2) = =左右两边的变量是引用数据类型,比地址;

        //2、equals():只能用在引用数据类型中
        //(1) equals()左右两边的引用数据类型的变量所在的类中,没有重写Object类继承过来的equals(),那么equals()比较两个变量的内存地址;
        //(2) 如果equals()左右两边的引用数据类型的变量所在的类中,重写Object类继承过来的equals(),那么equals()比较两个变量的属性值;
        //(3) String 重写了 equals()方法,比较的是 两个字符串的内容

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

        //trim()：去除字符串两端空白
        //toLowerCase()：将字符串转成小写字母。
        //toUpperCase()：将字符串转成大写字符

    }
}
