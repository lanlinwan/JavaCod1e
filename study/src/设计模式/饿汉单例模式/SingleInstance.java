package 设计模式.饿汉单例模式;


import java.io.Serial;
import java.io.Serializable;

/**
     *饿汉单例 实现单例
     */
    public class SingleInstance implements Serializable {
        //2. 饿汉单例模式是在获取对象前,对象已经提前准备好了
        //   定义静态成员变量,这个对象只能是一个
        private static final SingleInstance instance=new SingleInstance();
        //1. 构造器私有化
        private SingleInstance(){
            //防止反射破坏单例
            if (instance != null){
                throw new RuntimeException("单例对象无法重复创建");
            }
        }
        //3.静态方法 返回 单例对象
        public static SingleInstance getSingleInstance (){
            return instance;
        }

        //防止序列化 破坏单例
        @Serial
        public Object readResolve(){
            return instance;
        }
    }

