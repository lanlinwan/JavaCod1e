package 面向对象.接口.私有方法;

public class m implements inter{
        /*  接口中私有 方法的定义格式: .
            格式1: private 返回值类型方法名(参数列表) { }
            范例1: private void show() { }
            格式2: private static 返回值类型方法名(参数列表) { }
            范例2: private static void method() { }{
        */
        public static void main(String[] args) {
            m m =new m();
            m.show2();
            inter.show1();
        }

}
