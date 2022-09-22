package 常用api.Object;

import 面向对象.static修饰.User;

//Cloneable
//如果一介接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在Cloneable表示一旦了实现，那么当前类的对象就可以被克隆
//如果没有实现，当前类的对象就不能克隆
public class user implements Cloneable{
    private int id;
    private String name;
    private String password;
    private int[] data;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public user(){

    }

    public user(int id, String name, String password,int[] data) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.data=data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
       return "角色编号:"+id+",用户名:"+name+",密码"+password;
    }

    //浅克隆
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        //调用父类中的clone方法
//        //相当于java帮我们克隆一个对象,并把克隆之后的对象返回出去
//        return super.clone();
//    }

    //深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //先把被克隆对象中的数组获取出来
        int[] data=this.data;
        //创建新数组
        int[] newData=new int[data.length];
        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i]=data[i];
        }
        //调用父类中的方法克隆对象
        user u=(user)super.clone();
        //因为父类中的克隆方法是浅克隆,替换克隆出来的对象中的数组地址值
        u.data=newData;
        return u;
    }

}
