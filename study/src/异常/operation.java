package 异常;

public class operation {
    public static void main(String[] args) {
        //运行时异常:直接继承自RuntimeException或者其子类,编译阶段不会报错，运行时可能出现的错误。
        //运行时异常示例:
        //1. 数组索 引越界异常: ArrayIndexOutOfBoundsException
        //2. 空指针异常: NullPointerException, 直接输出没有问题,但是调用空指针的变量的功能就会报错。
        String name=null;
        System.out.println(name);
        System.out.println(name.length());
        //3. 数学操作异常: ArithmeticException
        //4. 类型转换异常: ClassCastException
        //5. 数字转换异常: NumberFormatException
        //运行时异常: - - 般是程序员业务没有考虑好或者是编程逻辑不严谨引起的程序错误,
    }
}
