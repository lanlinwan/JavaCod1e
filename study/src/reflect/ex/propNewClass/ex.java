package reflect.ex.propNewClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ex {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
     /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
    */

        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("D:\\JavaCode\\study\\src\\reflect\\prop.properties");
        properties.load(fis);
        System.out.println(properties);
        fis.close();

        //类名
        String className= (String) properties.get("classname");
        //方法名
        String methodName= (String) properties.get("method");

        //获取类
        Class clasz=Class.forName(className);

        //获取构造方法并创建对象
        Constructor con=clasz.getDeclaredConstructor();
        con.setAccessible(true);
        Object o=con.newInstance();

        //获取成员方法并运行
        Method method=clasz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);







    }
}
