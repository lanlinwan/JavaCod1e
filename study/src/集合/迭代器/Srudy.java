package 集合.迭代器;

public class Srudy implements Comparable<Srudy>{
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
    public String toString() {
        return "Srudy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    //重写 Comparable接口中的 compareTo方法
    @Override
    public int compareTo(Srudy o) {
        //按照学生年龄的升序排列，年龄一*样 按照姓名的字母排列，同姓名年龄视为同-一个人。

        //this:表示当前要添加的元素
        //o:表示已经在红黑树中存在的元素
        //返回值:
        //负数:表示当前要添加的元素是小的，存左边
        //正数:表示当前要添加的元素是大的，存右边
        //0:表示当前要添加的元素已经存在，

        //按着年龄 升序
        int i =this.getAge() - o.getAge();
        // i = 0 时 比较 姓名 按照 码表
        i= i==0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
