package 设计模式.饿汉单例模式;


    /**
     *饿汉单例 实现单例
     */
    public class SingleInstance  {
        //2. 饿汉单例模式是在获取对象前,对象已经提前准备好了
        //   定义静态成员变量,这个对象只能是一个
        public static SingleInstance instance=new SingleInstance();
        //1. 构造器私有化
        private SingleInstance (){

        }
    }

