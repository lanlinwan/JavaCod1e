package reflect.ex.zdys;

public class student1 {
    private String name;

    public String getDex() {
        return dex;
    }

    public student1(String name, int age, String dex) {
        this.name = name;
        this.age = age;
        this.dex = dex;
    }

    public void setDex(String dex) {
        this.dex = dex;
    }

    private int age;
    private String dex;

    public student1() {
    }

    public void studen1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){
        System.out.println("学生在学习！");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}

