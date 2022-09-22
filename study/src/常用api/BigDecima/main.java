package 常用api.BigDecima;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class main {
    public static void main(String[] args) {

    //1.通过传递double类型的小数来创建对象
    //细节:
    //这种方式有可能是不精确的，所以不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
    // System. out. print1n(bd1);
    // System. out . print1n(bd2);

    //2.通过传递字符串表示的小数来创建对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        //3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System. out. println(bd6) ;
        System.out.println(bd6==bd7);

        //细节:
        //1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        //2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        //3.如果我们传递的是8~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new


        //public static BigDecimal value0f( double val) 获取对象
        //public BigDecimal add(BigDecimal val)         加法
        //public BigDecimal subtract(BigDecimal val)    减法
        //public BigDecimal multiply( BigDecimal val)   乘法
        //public BigDecimal divide(BigDecimal val )     余法
        //public BigDecimal divide(BigDecimal val,精确几位，舍入模式) 除法

        //1.加法
        BigDecimal bd11 = BigDecimal.valueOf(10.0);
        BigDecimal bd22 = BigDecimal.valueOf(2.0);
        BigDecimal bd33 = bd1. add(bd2);
        //System. out . print1n(bd3);//12.0

        //2.减法
        BigDecimal bd44 = bd11 . subtract(bd22);
        //System. out . print1n(bd4);//8.0

        //3.乘法(除不尽会报错)
        BigDecimal bd55 = bd11.multiply(bd22);
        // System. out . print1n(bd5);//20.00

        //4.除法
        BigDecimal bd66 = bd11. divide(bd22, 2, RoundingMode.HALF_UP);
        System.out.println(bd66);//3.33











    }
}
