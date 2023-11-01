package Exercise.xianfen;

public class dg {
    static int m;
    public static void main(String[] args) {
        //100 + 99 + 98 +...+ (n-1)
        n(100);
        System.out.println(m);
    }

    private static void n(int num) {
            if (num!=0){
                m+=num;
                num--;
                n(num);
            }
    }
}
