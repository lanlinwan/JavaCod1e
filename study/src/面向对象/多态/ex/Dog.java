package 面向对象.多态.ex;

public class Dog extends Animal{
    public Dog() {
    }
    public Dog(int age, String color) {
        super(age, color);
    }
    public void eat(String som){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗紧紧抱着"+som+"");
    }
    public void lookHome(){
        System.out.println("看家");
    }
}
