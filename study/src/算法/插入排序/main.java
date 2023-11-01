package 算法.插入排序;

import java.util.Arrays;

public class main {
    //插入排序:
    //将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一“个当成是无序的。
    //遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
    //N的范围: 0~最大索引
    public static void main(String[] args) {
        int[] arr = {26, 55, 13, 18, 78, 65, 42, 66, 18, 19};
        //bubbleSort(arr);
        bubbleSort1(arr);
    }

    public static void bubbleSort(int[] arr) {
        // 从1开始遍历到最后一个元素
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //优化方式:
    //1.待插入元素进行比较时，遇到比自己小的元素，就代表找到了插入位置,无需进行后续比较
    //2.插入时可以直接移动元素,而不是交换元素
    public static void bubbleSort1(int[] arr) {
        //i代表待插入元素的索引
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i];//代表待插入的元素值
            int j = i - 1;   //代表已排序区域的元素索引最后一个
            while (j >= 0 && t < arr[j]) {//如果 待插入的元素值<已排序区域的元素

                arr[j + 1] = arr[j];//已排序区域的元素 后移一位

                j--;
            }
            //待插入的元素 插入位置: j-- 后+1
            arr[j + 1] = t;
            System.out.println(Arrays.toString(arr));
        }
    }
    //4.与选择排序比较
    //1. 二者平均时间复杂度都是0(n2)
    //2.大部分情况下，插入都略优于选择
    //3.有序集合插入的时间复杂度为
    //4.插入属于稳定排序算法，而选择属于不稳定排序
}
