package 常用api.Math;

public class main {
    public static void main(String[] args) {
        //Math.
        //public static int abs(int a) 获取参数绝对值
        System.out.println(Math.abs(-10.5));//10.5
        //public static double ceil(double a) 向上取整
        System.out.println(Math.ceil(10.2));//11.0
        //public static double floor(double a) 向下取整
        System.out.println(Math.floor(10.9));//10.0
        //public static int round(float a) 四舍五入
        System.out.println(Math.round(15.4));//15
        //public static int max(int a,int b) 获取两个int值中的较大值
        //public static int min(int a,int b) 获取两个int值中的较小值
        //public static double pow( double a, double b) 返回a的b次幂的值
        //public static double sqrt( double a, double b) 开根号
        //public static double cbrt( double a, double b) 开立方
        //public static double random() 返回值为double的随机值，范围[0.0,1.0)
        System.out.println(Math.random());
    }

}
