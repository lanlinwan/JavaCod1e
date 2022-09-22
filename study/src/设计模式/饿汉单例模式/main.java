package 设计模式.饿汉单例模式;

public class main {
   public static void main(String[] args) {
      SingleInstance s1=SingleInstance.instance;
      SingleInstance s2=SingleInstance.instance;

      System.out.println(s1==s2);
   }
}
