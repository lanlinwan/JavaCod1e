package Exercise;

public class Test {
    static boolean t=true;
    public static void main(String[] args) {
//        for (int i = 20; i < 10000; i++) {
//            float f = (float) i;
//            for (int j = 1; j <= 4; j++) {
//                // j是被猴子吃掉的,(f-j)/(float)(5.0)是被猴子藏起来的香蕉
//                f = (f - j) / (float) (5.0)*4;
//            }
//            if (f % 5 == 0) {
//                System.out.println(i);
//                break;
//            }
//        }
        for (int a = 20; a < 10000; a++) {
           a(a);

       }

    }
    static int b=1;
    public static void a(int aa){
        float f = (float) aa;
            for (int j = 1; j <= 4; j++) {
                // j是被猴子吃掉的,(f-j)/(float)(5.0)是被猴子藏起来的香蕉
                f = (f - j) / (float) (5.0)*4;
            }
            if (f % 5 == 0) {
                System.out.println(aa);
                t=false;
            }
    }
}
