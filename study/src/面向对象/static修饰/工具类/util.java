package 面向对象.static修饰.工具类;

import java.util.Random;

/**
 * 工具类
 */
public class util {
    //工具类无需创建对象,所以将构造器私有化
    private util(){
    }
    //静态方法
    public static String code(int n) {
        //验证码
        String code="";
        String data="abcdefghijklmnopqrstuvwxyz1234567890";
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(data.length());
            code +=data.charAt(index);
        }
        System.out.println("验证码: "+code);
        return code;
    }
}
