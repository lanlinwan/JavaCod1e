package 常用api.正则;

public class main {
    public static void main(String[] args) {
        //正则表达式: 校验字符串是否满足规则
        String qq="2903053386";
        //  \\ 表示我要插入一个正则表达式的反斜线: \ ,所以其后的字符具有特殊的意义。
        boolean a= qq.matches("[1-9]\\d{5,19}");
        System.out.println(a);//true
        //书写规则:

        //1. 字符类(只匹配一个字符):
        //[abc] 只能是a || b || c
        //[^abc] 除了a, b, c之外的任何字符
        //[a-zA-Z] a到zA到Z，包括(范围)
        //[a-d[m-p]] a到d，或m到p
        //[a-z&&[def]] a-z和def的交集。为: d,e, f
        //[a-z&&[^bc]] a-z和非bc的交集。(等同于[ad-z])
        //[a-z&&[^m-p]] a到z和除了m到p的交集。 (等同于[a-lq-z])

        //2. 预定义字符(只匹配一个字符):
        // . 任何字符
        // \d --个数字: [0-9]
        // \D 非数字: [^0-9]
        // \s 一个空白字符: [ \t\n\x0B\f\r]
        // \S 非空白字符: [^\s]
        // \w  [a-zA-Z_ 0-9] 英文、数字、下划线
        // \W  [^\w]一个非单词字符

        //3. 数量词:
        //X?     一次或0次
        //x*     零次或多次
        //X+     一次或多次
        //X{n}   正好n次
        //X{n,}  至少n次
        //X{n,m} 至少n但不超过m次





    }
}
