package 常用api.Biginterger;

import java.math.BigInteger;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        //Biginteger:表示一个大整数

        //1. BigInteger(int unm,Random r) 获取随机大整数,范围 [0~2的unm次方-1]
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            BigInteger a = new BigInteger(4, r);
            System.out.println(a);//[0~15]
        }

        //2.获取一个指定的大整数
        //必须是字符串,且是整数
        BigInteger b = new BigInteger("6666666666666666666666666666666666666666666666666");
        System.out.println(b);

        //3.获取指进制的大整数
        //细节:
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写9和1，写其他的就报错。
        BigInteger c = new BigInteger("110", 2);
        System.out.println(c);

        //4.静态方法获取BigInteger的对象，内部有优化
        //细节:
        //1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
        //2.在内部对常用的数字: -16 ~ 16进行了优化。
        // 提前把-16 ~ 16 先创建 好BigInteger的对象，如果多次获取不 会重新创建新的。
        BigInteger d=BigInteger.valueOf(16);
        BigInteger e=BigInteger.valueOf(16);
        System.out.println(d==e);//true

        //5.对象一旦创建,内部不能改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger result = bd9. add(bd10);
        System. out . println(result);//3
        //此时，不会修改参与计算的BigInteger对象中的值，而是产生了- - 个新的BigInteger对象记录3
        System. out. println(bd9 == result);//3
        System. out. println(bd10 == result);//3 .

        //public BigInteger add(BigInteger val) 加法
        //public BigInteger subtract(BigInteger val) 减法
        //public BigInteger multiply( BigInteger val ) 乘法
        //public BigInteger divide(BigInteger val) 除法，获取商
        //public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
        //public boolean equals(object x) 比较是否相同
        //public BigInteger pow( int exponent ) 次幂
        //public BigInteger max/min( BigInteger val) 返回较大值/较小值
        //public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误

        //1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger .valueOf(10);
        BigInteger bd2 = BigInteger. valueOf(2);
        //2.加法
        BigInteger bd3 = bd1. add(bd2);
        System. out. println(bd3);
        //3.除法，获取商和余数
        BigInteger[] arr = bd1. divideAndRemainder(bd2);
        System. out. println(arr[0]);//商
        System. out .println(arr[1]);//余数
        //4.比较是否相同
        boolean result1 = bd1. equals(bd2);
        System. out . println(result1);
        //5.次幂
        BigInteger bd4 = bd1. pow(2);
        System. out. println(bd4);
        //6. max
        BigInteger bd5 = bd1. max(bd2);
        System. out . println(bd5);


    }
}
