package io.序列化流;

import java.io.*;

public class xlh {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    // 序列化：将对象写入到IO流中
    // 反序列化：从IO流中恢复对象

    // 意义：序列化机制允许将实现序列化的Java对象转换位字节序列，这些字节序列可以保存在磁盘上，
    //      或通过网络传输，以达到以后恢复成原来的对象。序列化机制使得对象可以脱离程序的运行而独立存在。

    // 使用场景：对象的持久化之外，还能够用于对象的深度克隆
    //         所有可在网络上传输的对象都必须是可序列化的，比如RMI（remote method invoke,即远程方法调用），
    //         传入的参数或返回的对象都是可序列化的，否则会出错；所有需要保存到磁盘的java对象都必须是可序列化的。
    // 通常建议：程序创建的每个JavaBean类都实现Serializeable接口。

    //  普通序列化
    //  Serializable接口是一个标记接口，不用实现任何方法。一旦实现了此接口，该类的对象就是可序列化的。
    // 步骤一：创建一个ObjectOutputStream输出流；
    // 步骤二：调用ObjectOutputStream对象的writeObject输出可序列化对象。

            // ObjectOutputStream()
             ObjectOutputStream outputBuffer=new ObjectOutputStream(new FileOutputStream("B:\\aaaa.txt"));

             Person person=new Person("蓝本才",20);

             outputBuffer.writeObject(person);

    //反序列化
    //步骤一：创建一个ObjectInputStream输入流；
    //步骤二：调用ObjectInputStream对象的readObject()得到序列化的对象。
    //反序列化并不会调用构造方法。反序列的对象是由JVM自己生成的对象，不通过构造方法生成
             // 创建一个ObjectInputStream输入流
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("B:\\aaaa.txt")) ;
            //读取 序列化对象
            Person person1 = (Person) ois.readObject();
            System.out.println("反序列化:"+person1);

        //注意:
        //    序列化 和 反序列化有版本问题,使用版本号解决
        //    如果一个可序列化的类的成员不是基本类型，也不是String类型，
        //    那这个引用类型也必须是可序列化的；否则，会导致此类不能序列化
        //    (例如 序列化一个对象 他的参数上有另外一个对象,那么另外一个对象必须是可序列化的)

        //Java序列化算法:
        //所有保存到磁盘的对象都有一个序列化编码号,当程序试图序列化一个对象时，会先检查此对象是否已经序列化过，
        // 只有此对象从未（在此虚拟机）被序列化过，才会将此对象序列化为字节序列输出。如果此对象已经序列化过，则直接输出编号即可。
    }
}
