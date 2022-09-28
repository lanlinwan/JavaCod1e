package 算法.选择排序;

import java.util.Arrays;

public class main {
        //选择排序:
        //1，从0索引开始，跟后面的元素一- -比较。
        //2.小的放前面，大的放后面。
        //3，第一次循环结束后，最小的数据已经确定。
        //4.第二次循环从1索引开始以此类推。
    public static void main(String[] args) {
            int[] arr={26,55,13,18,78,65,42,66,18,19};
            bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
