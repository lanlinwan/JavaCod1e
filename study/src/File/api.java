package File;

import java.io.File;
import java.io.IOException;
/**
 * public String    getPath()      返回定义文件时使用的路径
 * public String    getAbsolutePath()返回文件的绝对路径
 * public String    getName()      返回文件名名称,带后缀
 * public long      length()       获取文件的大小
 * public long      lastModified() 返回文件最后的修改时间
 * public boolean   exists()       判断此路径表示的File是否存在
 * public boolean   isFile()       判断此路径名表示的File是否为文件
 * public boolean   isDirectory()  如果创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true。
 - public boolean   createNewFile()当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。 （几乎不用的，因为以后文件都是自动创建的！）
 - public boolean   delete() ：     删除由此File表示的文件或目录。 （只能删除空目录）
 - public boolean   mkdir() ：      创建由此File表示的目录。（只能创建一级目录）
 - public boolean   mkdirs() ：     可以创建多级目录（建议使用的）
 - public String[]  list()：        获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
   public File[]    list(FileFilter filter) 利用文件名过滤器 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
 - public File[]    listFiles()(常用)：  获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
 - public File[]    listFiles(FileFilter filter)(常用)：利用文件名过滤器获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
 - public File[]    listRoots()     获取本地所有盘符
 */
public class api {
    public static void main(String[] args) throws IOException {
        File ff = new File("study\\src\\data.txt");
        System.out.println("定义文件使用的路径"+ff.getPath());
        System.out.println("绝对路径"+ff.getAbsolutePath());
        System.out.println("文件名称"+ff.getName());
        System.out.println("文件大小"+ff.length());
        System.out.println("文件最后修改时间"+ff.lastModified());
        System.out.println("此路径表示的File是否存在"+ff.exists());
        System.out.println("此路径名表示的File是否为文件"+ff.isFile());


        File f = new File("study\\src\\data.txt");
        // 1.创建新文件，创建成功返回true ,反之 ,不需要这个，以后文件写出去的时候都会自动创建
        System.out.println(f.createNewFile());
        File f1 = new File("study\\src\\data02.txt");
        System.out.println(f1.createNewFile()); // （几乎不用的，因为以后文件都是自动创建的！）

        // 2.mkdir创建一级目录
        File f2 = new File("D:/resources/aaa");
        System.out.println(f2.mkdir());

        //3.isDirectory() 检查创建的是否是一个目录,是 返回true
        boolean t= f2.isDirectory();
        System.out.println(t? "是一个目录":"是一个文件");

        // 4.mkdirs创建多级目录(重点)
        File f3 = new File("D:/resources/ccc/ddd/eee/ffff");
//        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs()); // 支持多级创建

        // 5.删除文件或者空文件夹
        System.out.println(f1.delete());
        File f4 = new File("D:/resources/xueshan.jpeg");
        System.out.println(f4.delete()); // 占用一样可以删除

        //6. 只能删除空文件夹,不能删除非空文件夹.
        File f5 = new File("D:/resources/aaa");
        System.out.println(f5.delete());

        // 7、定位一个目录
        File f11 = new File("D:/resources");
        // 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
        String[] names = f11.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 8.一级文件对象
        // 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = f1.listFiles();
        for (File f111 : files) {
            System.out.println(f111.getAbsolutePath());
        }
    }
}
