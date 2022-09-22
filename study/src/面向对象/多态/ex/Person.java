package 面向对象.多态.ex;

public class Person {
    private int age;
    private String name;

    public Person(){

    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //饲养动物
    public void keepPet(Animal a,String som){
        if(a instanceof Dog b){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+b.getColor()+b.getAge()+"岁的狗");
            b.eat(som);
        }else if(a instanceof Cat c){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColor()+c.getAge()+"的狗");
            c.eat(som);
        }else{
            System.out.println("没有养这个动物");
        }

    }
}













