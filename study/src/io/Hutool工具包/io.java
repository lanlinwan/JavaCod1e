package io.Hutool工具包;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class io {
    public static void main(String[] args) {
        //IoUtil        流操作工具类
        //FileUtil      文件读写和操作的工具类
        //FileTypeUtil  文件类型判断工具类
        //Watch hMonitor 目录、文件监听
        //ClassPathResource 针对ClassPath中资源的访问封装
        //FileReader    封装文件读取
        //FileWriter    封装文件写入

        /*
        FileUtil类:
        file:根据参数创建一一个file对象
        touch:根据参数创建文件
        writeLines:把集合中的数据写出到文件中，覆盖模式。
        appendLines:把集合中的数据写出到文件中，续写模式。
        readLines:指定字符编码，把文件中的数据，读到集合中。
        readUtf8Lines:按照UTF-8的形式， 把文件中的数据，读到集合中
        copy:拷贝文件或者文件夹
        */
        File file= FileUtil.file("D:\\","aaa","bbb","a.txt");
        System.out.println(file);




    }
}
