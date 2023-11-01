package 字符集;

import java.util.Arrays;

public class main{
    public static void main(String[] args) throws Exception {
        // 1、编码:把文字转换成字节(使用指定的编码)
        String name = "abc我爱 你中国";
        // byte[] bytes = name. getBytes(); //以当前代码默认字符集进行编码 (UTF-8)
        byte[] bytes = name.getBytes("GBK"); //指定编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        // 2、解码:把字节转换成对应的中文形式(编码前和编码后的字符集必须- -致， 否则乱码)
        // String rs = new String(bytes); //默认的UTF-8
        String rs = new String(bytes, "GBK"); // 指定GBK解码
        System.out.println(rs);


        //1.在计算机中，任意数据都是以二进制的形式来存储的
        //2.计算机中最小的存储单元是一-个字节 8个bit

        //3. ASCII字符集中，一个英文占一个字节
        //4.简体中文版Windows,默认使用GBK字符集
        //5. GBK字符集完全兼容ASCII字符集
        //- -个英文占一-个字节，二进制第一位是0
        //-一个中文占两个字节，二进制高位字节的第- -位是1

        //6.Unicode字符集的UTF-8编码格式
        //一个英文占一个字节，二进制第一-位是0，转成十进制是正数
        //一个中文占三个字节，1 -进制第一-位是1,第一个字节转成十进制是负数

        //如何不产生乱码?
        //1，不要用字节流读取文本文件
        //2，编码解码时使用同-一个码表，同一个编码方式

    }



}
