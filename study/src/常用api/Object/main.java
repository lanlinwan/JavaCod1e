package 常用api.Object;

public class main {


    public static void main(String[] args) throws CloneNotSupportedException {
        //Object:所有对象的父类,只有无参构造,所以 子类默认访问父类无参构造器

        //1.  public String toString() 返回对象的字符串表示形式(直接打印一样的值)
        //一般会重写,打印对象属性值
        Object obj=new Object();
        String str=obj.toString();
        System.out.println(str);

        //2.  public boolean equals(Object obj)
        // 比较两个对象是否相等

        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System. out.println(s.equals(sb));// false
        //因为equals方法是被s调用的，而s是字符串
        //所以equals要看String类中的
        //字符串中的equals方法，先判断参数是否为字符串
        //如果是字符串，再比较内部的属性
        //但是如果参数不是字符串，直接返回false

        System. out. println(sb. equals(s));// false
        //因为equals方法是被sb调用的，而sb是StringBuilder
        //所以这里的equals方法要看StringBuilder中的equals方法
        //那么在StringBuilder当中，没有重写equals方法
        //使用的是object中的
        //在Object当中默认是使用==号比较两个对象的地址值
        //而这里的s和sb记录的地址值是不一样的，所以结果返回false

        //3.  public Class  clone对象克隆
        int[] data ={1,2,3,4,5};
        user u=new user(1,"lan","123456",data);
        //克隆:方法在底层会帮我们创建一个对象,并把源对象数据拷贝过去
        //书写细节:
        //1.重写Object中的clone()方法
        //2.让javabean类实现Cloneable接口
        //3.创建原对象并调用clone
        Object u1=u.clone();

        System.out.println(u);
        System.out.println(u1);//浅克隆:
        //        不管对象内部的属性是基本数据类型还是引用数据类型，都完全拷贝过来
        //        基本数据类型拷贝过来
        //深克隆:
        //       字符串复用
        //      引用数据类型会重新创建新的
        //以后深克隆会使用第三方工具







    }
}
