package 面向对象.封装;

public class main {

public static void main(String[] args) {
    Student s=new Student();
    s.setAge(33);
    System.out.println(s.getAge());
}
    //封装原则:封装 对象表现的行为,封装 对应的数据,并提供数据对应的行为
    //java体现:封装的意义就是 隐藏对象的属性和实现细节，仅对外公开接口，控制在程序中属性的读和修改的访问级别。

    //1、javabean的属性私有，提供get set对外访问,因为属性的赋值或者获取逻辑只能由javabean本身决定。
    //   而不能由外部胡乱修改
    //private String name ;
    //pub1ic void setName (String name) {
    //this.name = "tu1ing_ "+name;
    //}
    //该name有自己的命名规则，明显不能由外部直接赋值

    //封装的好处：
    //· 隐藏实现细节，提供公共的访问方式
    //· 提高了代码的复用性
    //· 提高安全性

    //2、orm框架
    //操作数据库,我们不需要关心链接是如何建立的、sq|是如何执行的， 只需要引入mybatis,调方法即可


}
