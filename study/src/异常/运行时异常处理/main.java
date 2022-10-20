package 异常.运行时异常处理;

public class main {
    public static void main(String[] args) {
        //可以不处理,编译阶段时不报错
        //建议还是处理,在最外层捕获处理即可
        try {
            chu(10,2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void chu(int a,int b){
        System.out.println(a);
        System.out.println(b);
        int c=a/b;
        System.out.println(c);
    }
}
