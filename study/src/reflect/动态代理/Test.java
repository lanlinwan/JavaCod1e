package reflect.动态代理;

public class Test {
    public static void main(String[] args) {
         /*
        需求:
        外面的人想要大明星唱一-首歌
        1.获取代理的对象
        代理对象= ProxyUtil. createProxy(大明星的对象);
        2.再调用代理的唱歌方法
        代理对象.唱歌的方法("只因你太美");
        */

        BigStar bigStar=new BigStar("鸡哥");
        //获取代理的对象,被代理的对象作为参数
        Star proxy=ProxyUtil.createProxy(bigStar);
        //使用代理对象 调用sing方法
        String result = proxy.sing("只因你太美");
        System.out.println(result);
        //使用代理对象 调用dance方法
        proxy.dance();
    }
}
