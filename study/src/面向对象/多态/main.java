package 面向对象.多态;

public class main {
    public static void main(String[] args) {
        //多态: 同类型对象,表现出的不同形态
        //     同一个接口，使用不同的实例而执行不同操作
        //多态前提: 有继承关系
        //        有父类引用指向子类对象: 父类对象 对象名称 =子类对象
        //        有方法重写

        //1. 使用父类作为参数接收所有 子类对象,提高了代码 高效,便利
        Teacher t=new Teacher();
        t.setName("lan");
        t.setAge(18);

        Student s=new Student();
        s.setName("ben");
        s.setAge(19);

        Administrator a=new Administrator();
        a.setName("cai");
        a.setAge(20);

        register(t);
        register(s);
        register(a);

        //2. 创建对象(多态方式);
        Person p=new Student();
        p.setName("兰");
        //调用成员变量:编译看左边,运行也看左边
        //编译时 父类中没有这个变量报错,运行时 获取的是父类中的变量
        System.out.println(p.id);// 人
        //调用成员方法:编译看左边,运行看右边
        p.show();// 学生

        //3. 多态优点与缺点
        //优: 可以使程序有良好的扩展，
        //   可对所有类的对象进行通用处理。
        //   降低daima
        //缺:调用成员变量:编译看左边,运行看右边,所以无法调用子类特有的方法
        //解决:变回子类类型
        //判断 p 是否为 Student类型,如果是则强转为 Student类型
        if(p instanceof Student h){
             Student pp=(Student) p;
             pp.s();
             pp.show();
        }else if(p instanceof Teacher th){
            th.show();
        }



    }

    //同时接收三个不同的对象,只能把参数写成他们共同的父类
    public static void register(Person p){
        p.show();
    }
}
