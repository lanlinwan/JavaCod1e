package 变量运算符;

public class 逻辑运算符 {
    public static void main(String[] args) {
// && 	a&&b 	短路与 	ab全为true时,计算结果为true,否则为false。 	 2>1&&3<4 	true
// || 	a||b 	短路或 	ab全为false时,计算结果为false,否则为true。 	2<1||3>4 	false
// ! 	!a 	    逻辑非 	a为true时,值为false,a 为false 时,值为true 	!(2>4)   	true
// | 	a|b 	逻辑或 	ab全为false时,计算结果为false,否则为true     1>2|3>5 	false
// & 	a&b 	逻辑与 	ab全为true时,计算结果为true,否则为false 	    1<2&3<5 	true
// ^   true^false TRUE  异或运算符，只要两边的操作数不同，结果就是true .

// |  &  ^  计算数字 都会转换为 2进制进行运算

// instanceof 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
    }
}
