package io.ex爬虫;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class name {
    public static void main(String[] args) throws IOException {

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1bd&from=kg0" ;
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html" ;

        //爬取数据,把网址上的数据拼接成字符串
        String a= webCrawler(familyNameNet);
        String b=webCrawler(boyNameNet);
        String c=webCrawler(girlNameNet);

        //System.out.println(b);
        //通过正则表达式,筛选数据
       // ArrayList<String> arr=getData(familyNameNet,"(.{4})(，|。)",1);
        ArrayList<String> arr2=getData(boyNameNet,"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        //ArrayList<String> arr3=getData(boyNameNet,"(.. ){4}..",0);


    }



    private static ArrayList<String> getData(String familyNameNet, String s,int index) {
        ArrayList<String> list=new ArrayList<>();
        //2.正则表达式去获取数据
        Pattern pattern=Pattern.compile(s);
        //对数据进行筛选
        Matcher matcher= pattern.matcher(familyNameNet);
        while (matcher.find()){
            String group=matcher.group(index);
            list.add(group);
            System.out.println(group);
        }

        return list;
    }

    private static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder 拼接字符串
        StringBuilder str=new StringBuilder();
        //2.创建一个URL对象
        URL url=new URL(net);
        //3.链接网址,必须保证是能连上的
        URLConnection conn=url.openConnection();
        //4.读取数据 io,使用转换流
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while((ch=isr.read())!=-1){
            str.append((char)ch);
        }
        //5.释放资源,返回数据
        isr.close();;
        return str.toString();
    }
}
