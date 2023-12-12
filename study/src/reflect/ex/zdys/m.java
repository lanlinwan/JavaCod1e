package reflect.ex.zdys;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class m {
    public static void main(String[] args) {

        try {
            student1 c= (student1) queryOne(new student("lan",18),new student1());
            //System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ;

    public static <T,S> Object queryOne(T clazz, S clazz1) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
         Class ClassT=clazz.getClass();
         Class ClassS=clazz1.getClass();

        //获取构造方法
        Constructor cons2= ClassS.getDeclaredConstructor();
        cons2.setAccessible(true);
        //创造 一个对象
        Object c=cons2.newInstance();


        //获取 所有属性
        Field[] fields = ClassT.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
            field.setAccessible(true);
            //获取属性的值
            Object zhi = field.get(clazz);
            System.out.println(zhi);

            field.set(c,zhi);
        }
        System.out.println(c);

        return c;
    }
}
