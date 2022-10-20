package io.copy;

import java.io.*;

public class 字符流 {
    public static void main(String[] args) throws Exception {
        //字符缓冲输入出流 实现类:BufferedReader
        try (
                Reader fr = new FileReader("study\\src\\data.txt");
                //1.把原始的字节输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);

        ){
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //字符缓冲输出出流 实现类:BufferedWriter
        Writer wr=new FileWriter("study\\src\\data.txt",true);//追加管道
        BufferedWriter bw=new BufferedWriter(wr);
        bw.write(99);
        bw.write("蓝本才");
        bw.write('兰');
        bw.newLine();
        //写字符数组
        char[] chars="abc蓝本才".toCharArray();
        bw.write(chars);
        //写字符一部分
        bw.write("abc蓝本才",0,3);

        bw.flush();
        bw.close();

    }

}
