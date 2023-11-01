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

    //优化方式:
    //        为减少交换次数，每一轮可以先找最小的索引,在每轮最后再交换元素
    public static void bubbleSort1(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            //i 代表每轮选择最小元素要交换到的目标索引
            int s=i;//代表最小元素索引
            for (int j = s+1; j < arr.length; j++) {
                if(arr[s]>arr[j]){
                    s=j;//比较后 更新最小元素索引
                }
            }
            if (s != i){//最小元素索引 发生变化,说明还没排好序,如果已排好序 则不交换
                int temp=arr[i];
                arr[i]=arr[s];
                arr[s]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //与冒泡排序比较
    //1. 二者平均时间复杂度都是0(n2)
    //2.选择排序一 般要快于冒泡，因为其交换次数少
    //3.但如果集合有序度高， 冒泡优于选择
    //4.冒泡属于稳定排序算法， 而选择属于不稳定排序
}
