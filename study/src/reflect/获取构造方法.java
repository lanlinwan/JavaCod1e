package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class 获取构造方法 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    /*
        Class类中用于获取构造方法的方法
            Constructor<?>[] getConstructors()                                返回所有公共构造方法对象的数组
            Constructor<?>[] getDeclaredConstructors()                        返回所有构造方法对象的数组
            Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象


        Constructor类中用于创建对象的方法
            T newInstance(Object... initargs)                                 根据指定的构造方法创建对象
            setAccessible(boolean flag)                                       设置为true,表示取消访问检查
    */

        Class<?> clasz= Class.forName("reflect.Student");

        //1. 获取公开的构造方法
        Constructor[] cons=clasz.getConstructors();
//        for (Constructor con : cons) {
//            System.out.println(con);
//        }

        //2. 获取所有的构造方法
        Constructor[] cons1=clasz.getDeclaredConstructors();


        //3. 获取空参构造方法
        Constructor cons2=clasz.getDeclaredConstructor();

        //4. 获取有参构造方法
        Constructor cons3=clasz.getDeclaredConstructor(String.class,int.class);

        //5. 获取构造方法的修饰符(用整数表示)
        int modifiers = cons3.getModifiers();
        System.out.println("修饰符:"+modifiers);

        //6. 获取构造方法所有的参数
        Parameter[] parameters = cons3.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //暴力反射：表示临时取消权限校验
        cons3.setAccessible(true);
        //创造 一个对象
        Student stu = (Student) cons3.newInstance("张三",66);

        System.out.println(stu);



    }
}
