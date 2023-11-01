package 面向对象.封装.javabean;

//javaBean 也可称为实体类,其对象可以用于在程序中封装数据
public class main {
    public static void main(String[] args) {
        //有参数构造器
        User u=new User();
        u.setName("lan");
        u.setHeight(0.6);
        u.setSalary(8888);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());

        //无参数构造器
        User u1=new User("LAN",0.66,1000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());
    }

}
