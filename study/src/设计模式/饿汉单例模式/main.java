package 设计模式.饿汉单例模式;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.springframework.objenesis.instantiator.util.UnsafeUtils;

public class main {
   public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
      SingleInstance s1=SingleInstance.getSingleInstance();
      SingleInstance s2=SingleInstance.getSingleInstance();
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1==s2);//true

      枚举实现 mu=枚举实现.getInstance();
      枚举实现 mu1=枚举实现.getInstance();
      System.out.println(mu==mu1);

      // 反射破坏单例
      // reflection(SingleInstance.class);

      // 反序列化破坏单例
//        serializable(Singleton3.getInstance());

      // Unsafe工具类 破坏单例
      // unsafe(SingleInstance.class);
   }

   private static void unsafe(Class<?> clazz) throws InstantiationException {
      Object o = UnsafeUtils.getUnsafe().allocateInstance(clazz);
      System.out.println("Unsafe 创建实例:" + o);
   }

   private static void serializable(Object instance) throws IOException, ClassNotFoundException {
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(bos);
      oos.writeObject(instance);
      ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
      System.out.println("反序列化创建实例:" + ois.readObject());
   }

   private static void reflection(Class<?> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
      Constructor<?> constructor = clazz.getDeclaredConstructor();
      constructor.setAccessible(true);
      System.out.println("反射创建实例:" + constructor.newInstance());
   }
}


