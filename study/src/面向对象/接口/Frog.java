package 面向对象.接口;

public class Frog extends Animal implements Swim{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃蚊子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
