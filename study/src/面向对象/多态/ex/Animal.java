package 面向对象.多态.ex;

public class Animal {
    private int age;
    private String color;

    public Animal(){

    }
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String name) {
        this.color = name;
    }

    public void eat(String something){
        System.out.println("动物在吃"+something);
    }
}
