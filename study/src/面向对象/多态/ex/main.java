package 面向对象.多态.ex;

public class main {
    public static void main(String[] args) {
        Person p=new Person(18,"兰");
        Dog d=new Dog(2,"黑");
        p.keepPet(d,"骨头");
    }
}
