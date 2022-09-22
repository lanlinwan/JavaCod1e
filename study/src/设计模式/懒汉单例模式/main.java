package 设计模式.懒汉单例模式;

public class main {
    public static void main(String[] args) {
        Singleinstance s1=Singleinstance.getInstance();
        Singleinstance s2=Singleinstance.getInstance();
        System.out.println(s1==s2);
    }
}
