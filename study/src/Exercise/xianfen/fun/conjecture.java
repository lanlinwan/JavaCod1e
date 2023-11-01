package Exercise.xianfen.fun;

public class conjecture {
    public static void main(String[] args) {
        Goldbachconjecture(20);
    }

    private static void Goldbachconjecture(int num) {
        if (num<7 || Math.round(num) != num){
            System.out.println("请输入正确的数");
            return;
        }
        for (int i = 2; i < num/2+1 ; i++) {
            int k=i;
            int j=num - i;
           boolean a = zhishu(k);
           boolean b = zhishu(j);
           if (b && a){
               System.out.println(num+"被分解为"+k+" 和 "+j);
           }

        }
    }

    private static boolean zhishu(int num) {
        boolean a=true;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                a= false;
            }
        }
        return a;
    }
}
