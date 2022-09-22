package 面向对象.内部类.匿名内部类;

public class main {
    public static void main(String[] args) {
        //匿名内部类:隐藏了名字的内部类,可以写在成员位置,也可以写在局部位置
        //new 接口/类 {
        //     重写方法();
        // };

        //new 创建的是 后面的整体对象,匿名内部类是 大括号包含的内容
        //后面的匿名内部类 实现了了接口 或者 继承了父类
        new Swim(){//接口
            @Override
            public void swim() {
                System.out.println("重写方法");
            }
        };
        new propel(){//类
            @Override
            public void eat() {
                System.out.println("人吃饭");
            }
        };

        //接口多态
         Swim s= new Swim(){//整体可以理解为 Swim接口的实现类对象
            @Override
            public void swim() {
                System.out.println("重写方法");
            }
        };
         s.swim();
         //直接调用自己的方法
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写方法");
            }
        }.swim();





        //使用场景:以前调用下面的 method() 需要重新编写一个子类继承 propel父类
        //       再创建之类的对象传递给方法 method()
        //       如果 propel类只使用一次,单独定义一个类麻烦
        //   现在:
        method(
                new propel() {
                    @Override
                    public void eat() {
                        System.out.println("中午吃什么?");
                    }
                }
        );
    }
    //多态的函数实现
    public static void method(propel p){
        p.eat();
    }


}
