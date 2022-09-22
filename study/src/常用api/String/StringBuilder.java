package 常用api.String;

public class StringBuilder {
    public static void main(String[] args) {
        //StringBuilder 可以看成一个容器,创建以后里面的内容是可变的
        //作用:提高字符串操作效率
        java.lang.StringBuilder sb = new java.lang.StringBuilder("兰");
        System.out.println(sb);//底层进行了特殊处理,打印的是 属性值
        //1. append() 添加数据,并返回对象本身
        //sb.append("本");
        //sb.append("才");
        //sb.append(18);
        //sb.append("岁");
        //链式编程
        sb.append("本").append("才").append(18).append("岁");
        System.out.println(sb);
        //2. reverse() 反转容器内容
        sb.reverse();
        System.out.println(sb);
        //3. length()  返回长度
        System.out.println(sb.length());
        //4. toString() 可以把StringBuilder 转换为 string
        String s = sb.toString();
        System.out.println(s);


        //练习:将数组转换为 字符串
        int[] arr = {1, 2, 3};
        java.lang.StringBuilder ss = new java.lang.StringBuilder();
        ss.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr .length-1){
                ss.append(arr[i]);
            }else{
                ss.append(arr[i]).append(", ");
            }
        }
        ss.append("]");
        System.out.println(ss);

    }
}


