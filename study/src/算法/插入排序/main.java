package 算法.插入排序;

import java.util.Arrays;

public class main {
    //插入排序:
    //将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一“个当成是无序的。
    //遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
    //N的范围: 0~最大索引
    public static void main(String[] args) {
        int[] arr={26,55,13,18,78,65,42,66,18,19};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        //1. 找到无序的数组是从哪一个索引开始无序的
        int start=-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>arr[i+1]){
                start=i+1;
                break;
            }
        }
        //2. 从start 开始遍历到最后一个元素
        for (int i = start; i <arr.length; i++) {

            int j=i;

            while (j>0 && arr[j] < arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
