package 集合.双列集合.map.TreeMap;

import 集合.双列集合.map.Srudy;

import java.util.TreeMap;

public class ex {
    public static void main(String[] args) {
        /*
        TreeMap集合:基本应用
        需求2:
        键:学生对象
        值:籍贯
        要求:按照学生年龄的升序排列，年龄- -样 按照姚名的字母排列，同姓名年龄视为同一一个人。
*/

        //1.创建集合
        TreeMap<Srudy, String> tm = new TreeMap<>();
//2.创建三个学生对象
        Srudy s1 = new Srudy(" zhangsan", 24);
        Srudy s2 = new Srudy("lisi", 23);
        Srudy s3 = new Srudy("wangwu", 24);
//3.添加元素
        tm.put(s1, "江苏");
        tm.put(s2, "天津");
        tm.put(s3, "北京");
//4.打印集合
        System.out.println(tm);


    }
}
