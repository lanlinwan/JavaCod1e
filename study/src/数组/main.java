package 数组;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //一.静态初始化:
        //完整格式: 数据类型[] 名字=new[]{元素1,元素2};
        //简化格式: 数据类型[] 名字={元素1,元素2};
        //        数据类型 名字[]={元素1,元素2};

        //字符串数组
        String[] names={"兰","本","才","剑","辉","平"};
        //使用索引访问,修改
        System.out.println(names);
        names[0]="蓝";
        System.out.println(names[0]);
        //数组长度
        System.out.println(names.length);

        //注意:
        //1.数组变量名存储的是 数组在内存中的地址,数组是引用类型
        //2.什么类型的数组存放什么类型的数据,否则报错
        //3.数组一旦定义,在程序执行中,长度,类型就固定了

        //二.动态初始化
        //数据类型[] 数组名=new 数据类型[长度];
        int[] arri=new int[3];
        //直接访问会 访问默认值
        int[] arr=new int[]{1, 2, 3};
        int arro[] =new int[]{1, 2, 3};
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;


        //三.数组遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
