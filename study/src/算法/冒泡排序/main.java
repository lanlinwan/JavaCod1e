package 算法.冒泡排序;

import java.util.Arrays;

public class main {
    //冒泡排序:
    //   核心思想:0相邻的元素两两比较，大的放右边，小的放左边。
    //     2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环1次， 后面以此类推。
    //     3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
    public static void main(String[] args) {
        int[] arr={26,55,13,18,78,65,42,66,18,19};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
