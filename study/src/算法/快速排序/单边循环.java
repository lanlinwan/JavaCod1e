package 算法.快速排序;

import java.util.Arrays;

public class 单边循环 {
    public static void main(String[] args) {
        //单边循环快排 (lomuto 洛穆托分区方案):
        //①选择最右元素作 为基准点元素
        //②j 指针负责找到比基准点小的元素, -旦找到则与i进行交换
        //③i 指针维护小于基准点元素的边界，也是每次交换的目标索引
        //④最后基准点与 i交换，i即为分区位置


        int[] arr = {26, 55, 13, 18, 78, 65, 42, 66, 18, 19};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r){
            return;
        }
        int pv = arr[r];//基准点元素
        int i = l;//
        for (int j = l; j < r; j++) {//
            if (arr[j]<pv){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[r];
        arr[r]=arr[i];
        arr[i]=temp;

        quickSort(arr,l,r-1);
        quickSort(arr,l+1,r);

    }
}
