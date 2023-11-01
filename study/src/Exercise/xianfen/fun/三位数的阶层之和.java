package Exercise.xianfen.fun;

public class 三位数的阶层之和 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        for (int i = 100; i < 999; i++) {
            a=i%10;
            b=i/10%10;
            c=i/100;
            int num=jie(a)+jie(b)+jie(c);
            if (num==i){
                System.out.println("在这个数是"+i);
                break;
            }
        }
    }

    private static int jie(int num) {
        int a=1;
        for (int i = 1; i < num+1; i++) {
            a=a*i;
        }
        return a;
    }
}
