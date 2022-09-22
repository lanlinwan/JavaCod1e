package 方法;

public class main {
    public static void main(String[] args) {
        int a=5;
        int b=5;
        int c=add(a,b);
        System.out.println(c);

        print();
    }

//    方法的修饰符  返回值类型  方法名   形参列表
    public static   int     add  (int a,int b){
        int c=a+b;
        return c;
    }

//  无参数 无返回值 的方法
    public static void print(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}
