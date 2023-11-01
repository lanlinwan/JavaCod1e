package 集合.双列集合.map;

import java.util.Objects;

public class Srudy {
    private  String name;
    private int age;

    public Srudy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Srudy srudy = (Srudy) o;
        return age == srudy.age && Objects.equals(name, srudy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Srudy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




}
