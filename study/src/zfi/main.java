package zfi;

import java.util.Arrays;

public class main {
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
    }

}
