package io.Commons_io工具包;

public class io {
    public static void main(String[] args) {
        //Commons-io常见方法

        //FileUtils类: (文件/文件夹相关)
        //static void copyFile(File srcFile, File destFile)     复制文件
        //static void copyDirectory(File srcDir, File destDir)  复制文件夹
        //static void copyDirectoryToDirectory(File srcDir, File destDir) 复制文件夹
        //static void deleteDirectory(File directory)           删除文件夹
        //static void cleanDirectory(File directory)            清空文件夹
        //static String readFileToString(File file, Charset encoding)      读取文件中的数据变成成字符串
        //static void write(File file, CharSequence data, String encoding) 写出数据

        //lOUtils类: ( 流相关相关)
        //public static int copy( InputStream input, OutputStream output ) 复制文件
        //public static int copyLarge( Reader input, Writer output)        复制大文件
        //public static String readLines ( Reader input)                   读取数据
        //public static void write(String data, OutputStream output )      写出数据
    }
}
