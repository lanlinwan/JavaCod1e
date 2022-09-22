package 面向对象.多态.ex;

public class Cat extends Animal{
    public Cat() {
    }
    public Cat(int age, String color) {
        super(age, color);
    }
    public void eat(String som){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫咪紧紧抱着"+som+"");
    }
    public void  catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
