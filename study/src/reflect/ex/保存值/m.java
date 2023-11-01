package reflect.ex.保存值;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class m{
    public static void main(String[] args) throws IllegalAccessException, IOException, ClassNotFoundException {
    /*
        对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
    */
        Student s = new Student("小A",23,'女',167.5,"睡觉");
        Teacher t = new Teacher("播妞",10000);
        saveObject(s);
    }

    private static void saveObject(Student s) throws ClassNotFoundException, IOException, IllegalAccessException {

        //1.获取 class对象
        Class clasz = s.getClass();

        //2. 创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaCode\\study\\src\\反射\\a.txt"));
        //3. 获取成员变量
        Field[] fields = clasz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            //获取成员变量的名字
              String name=field.getName();
            //获取成员变量的值
            Object value= field.get(s);
            //写出数据
            bw.write(name + "=" + value);
            //换行
            bw.newLine();

        }
        bw.close();

    }
}

