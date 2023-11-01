package Exercise.xianfen.fun;

public class 几位数 {

    public static void main(String[] args) {
     shu(1000000000)  ;
    }

    private static void shu(int nmu) {
        String s=String.valueOf(nmu);
        String[] SS= s.split("");
        int wei=SS.length;
        System.out.println("是"+wei+"位数");
    }


}
