package 语法.枚举;
//枚举 是Java一种特殊类型
//作用:做信息标志和信息分类,和 常量对比,解决了入参值不受约束
public enum myenum {
    //枚举必须是第一行 记住的是枚举类的对象名称,建议全部大写
    SPRING,SUMMER,AUTUMN,WINTER;
    //特征:枚举类都是继承了枚举类型:java.lang.Enum
    //    枚举都是最终类,不能被继承
    //    构造器私有,不能对外创建对象
    //    第一行默认都是罗列枚举对象的名称
    //    从第二行开始,可以定义类的其他成员
    //    相当是多例模式

    //values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：
    //    values() 返回枚举类中所有的值。
    //    ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
    //    valueOf()方法返回指定字符串值的枚举常量。


}
