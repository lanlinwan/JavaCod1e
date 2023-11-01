package 变量运算符;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //一. 变量
        //com、变量要先声明再使用
        //2、变量声明后，不能存储其他类型的数据。
        //3、变量的有效范围是从定义{开始到“}”截止,且在同一个范围内部不能定义2个同名的变量。
        //4、变量定义的时候可以没有初始值，但是使用的时候必须给初始值。
        int age = 25;
        System.out.println(age);



        //二. 数据类型 变量名称 = 初始值;
        // 注意：从右往左边看的（赋值）
        //com. byte  字节型 1字节  -128~127
        byte b =5;

        //2. short 短整型 2字节
        short c=5;

        //3. int   整型   4字节  默认的整数类型
        int aa=5;

        //4. long  长整型 8字节
        long d=445454545;
        // 注意：随便写一个字面量34243243243245默认是当成int类型的，34243243243245虽然没有超过long的范围
        // 但是34243243243245它超过了int本身的范围，如果希望34243243243245这个数据是long类型的，需要在后面加L l
        long e= 454545454545454554L;

        //5、double 双精度
        double score = 99.56565;

        //6. float 浮点型（小数）
        float g= (float) 3.1415926;
        // float称为单精度小数：注意：随便写一个小数字面量默认是double类型的，如果希望随便写一个小数默认是float类型的需要加上F/f

        // 7、字符型
        char ch = '徐';
        char ch1 = '黑';

        // 8、布尔类型
        boolean flag = true;
        boolean flag2 = false;

        //9. 表达式自动转换类型
        //(com)在表达式中,小范围的类型的变量会自动转换为当前较大范围的类型再运算
        //表达式的最终结果由表达式中最高类型决定
        byte a3 = 10;
        int b1 = 20;
        double c1 = 0;
        double rs = a3 + b1 + c1;
        //(2)再表达式中,byte  ,short  ,char 是直接转换int类型参与运算
        byte i = 100;
        byte j = 120;
        int k = i + j;//使用byte类型接收报错
        //(3)强制类型转换  一般由大转小: 数据类型 变量2=(数据类型)变量1  数据
        int a4 =20;
        byte b4= (byte)a4;
        //强制类型转换 可能造成数据丢失
        //浮点 转 整形,会直接丢掉小数部分,保留整数
        float a5=99.5f;
        int b5=(int)a5;
        System.out.println(b5);



        //三. 运算符
        //com. +符号做连接符的识别
        //整数与字符型 相加 会得到 码表代表的数字相加 'a' 98
        //整数与字符串 会拼接成字符串
        int a = 5 ;
        System.out.println("abc" + 'a'); // abca
        System.out.println("abc" + a);   // abc5
        System.out.println(a + "" +'a'); // 5a
        System.out.println(5 + a); // 10
        System.out.println("abc" + 5 + 'a'); // abc5a
        System.out.println(15 + "abc" + 15); // 15abc15
        System.out.println(a + 'a'); // 102

        System.out.println(a + 'a'+" itheima "); // 102 itheima
        System.out.println("itheima"+ a + 'a'); // itheima5a
        System.out.println("itheima"+ ( a + 'a' ));// itheima102

        //2.自增自减运算符： ++ --
        // 在表达式中或者不是单独操作的情况，++ -- 在变量前后存在区别
        // ++ -- 在变量前面。先+com -com 再使用。
        int i1 = 10;
        int j1 = ++i1;
        System.out.println(i1); // 11
        System.out.println(j1); // 11

        // ++ -- 在变量的后面 先使用再+com -com
        int m = 10;
        int n = m++;
        System.out.println("m"+m); // 11
        System.out.println("n="+n); // 10
        int n1 = m++;
        System.out.println("n1="+n1); // 11


        //3. 赋值运算符：= += -= *= /= %=
        //m += n;
        //m -= n;  // 等价于： m = (int)(m - n)
        //m *= n;  // 等价于： m = (int)(m * n)
        // m /= n;  // 等价于： m = (int)(m / n)
        m %= n;  // 等价于： m = (int)(m % n)
        System.out.println(m);

        //4.  逻辑运算符，并能够选择合适的逻辑运算符解决问题。
                double size = 9.8;
                double storage = 6;
                // 需求：尺寸大于等于6.95 内存要大于等于8GB
                // 注意：必须前后都是true结果才是true
                System.out.println(size >= 6.95 & storage >=8);

                // 需求：要么内存大于等于8 要么尺寸大于等于6.95
                // 注意：只要有一个是true 结果就一定是true
                System.out.println(size >= 6.95 | storage >=8);

                System.out.println(!true);
                System.out.println(!false);

                // 逻辑异或：必须两个不同结果才是true
                System.out.println(false ^ true); // true
                System.out.println(true ^ false); // true
                System.out.println(true ^ true); // false
                System.out.println(false ^ false); // false

        //5.三元运算符
        // 条件表达式 ? 值1 : 值2
        double scor =98;
        String re=scor >=60?"考试通过":"考试并通过";
        System.out.println(re);// 通过


        //api接口:键盘输入
        //com.键盘扫描对象
        Scanner sc =new Scanner(System.in);
        //2.调用sc对象的功能,等待用户输入的数据
        System.out.println("请输入年龄");
        int age1= sc.nextInt();

        System.out.println("请输入名字");
        String name=sc.next();

        System.out.println("欢迎登录"+name);

         // \转义字符 改变后面那个字符原本的含义
        //练习:以字符串的形式打印- 一个双引号
        //”在Java中表示字符串的开头或者结尾
        //此时\表示转义字符，改变了后面那个双引号原本的含义
        //把他变成了一个普普通通的双引号而己。
        System.out. println("\"");


        //基本数据类型转换为字符串类型：
        // 1、将基本数据类型与空字符串（" "）连接（+）即可获得其所对应的字符串
        // 2、调用String 类中的valueOf()方法返回相应字符串
        // 3、使用包装类的toString()方法
        int l = 16;
        String s1 = Integer.toString(l);  //方法1
        String s2 = String.valueOf(l);    //方法2
        String s3 = l + "";               //方法3
        System.out.println(s1+s2+s3);

        // 字符串类型转换为基本数据类型：
        // 1、调用基本数据类型对应的包装类中的方法parseXX
        // 2.对应包装类型的valueOf();
        String s = "16";
        int nn= Integer.parseInt(s);   //方法1
        int mm = Integer.valueOf(s);    //方法2
        System.out.println(nn+mm);


       

    }

}
