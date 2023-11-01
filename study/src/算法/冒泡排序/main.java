package 算法.冒泡排序;

import java.util.Arrays;

public class main {
    //冒泡排序:
    //   核心思想:0相邻的元素两两比较，大的放右边，小的放左边。
    //     2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环1次， 后面以此类推。
    //     3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
    //     4.如果 已经排好序了,应该推出循环,以是否发生交换为准
    public static void main(String[] args) {
        int[] arr={26,55,13,18,78,65,42,66,18,19};
        int[] arr1={1,5,3,2,6,4};
       // bubbleSort(arr);
        bubbleSort1(arr1);
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {//
            boolean swapped=false;//是否 发生了交换
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            if(!swapped){//
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //优化:当进行到一次交换时,如果后面的已经排好序了,则下一次不需要再 对后面的进行比较
    //    且当这个值为0,表示整个数组有序,退出循环
    public static void bubbleSort1(int[] arr){
        int n= arr.length-1;//
        while (true){
            int last=0;//表示最后一次交换 索引的位置
            System.out.println("比较次数"+n);
            for (int i = 0; i < n; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                    last=i;//发生交换后 进行记录
                }

            }
            n=last;//最后一次交换的索引
            System.out.println("冒泡"+Arrays.toString(arr));
            if(n==0){
                break;
            }
        }

    }

}
