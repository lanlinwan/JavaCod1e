package 面向对象.封装;

public class Student {
    //成员变量 private ,只能在本类中使用
    private int age;

    // setAge getAge 方法暴露
    public void setAge(int age) {
        if(age >=0 && age <= 200){
            this.age = age;
        }else{
            System.out.println("年龄输入错误");
        }
    }

    public int getAge(){
        return age;
    }

}
