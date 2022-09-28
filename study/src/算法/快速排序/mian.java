package 算法.快速排序;

import java.util.Arrays;

public class mian {
    /*
   快速排序:
   第一轮:以0索引的数字为基准数，确定基准数在数组中正确的位置。
   比基准数小的全部在左边，比基准数大的全部在右边,后面以此类推。
   */
    public static void main(String[] args) {
        int[] arr = {26, 55, 13, 18, 78, 65, 42, 66, 18, 19};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找的值
        int start = i;
        int end = j;

        if (start>end){
            //出口
            return;
        }

        //记录基准数
        int baseNumber = arr[i];
        //利用循环找到要交换的数字
        while (start != end) {
            //利用end，从后往前开始找，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start，从前往后找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
            //当start和end指向了同一一个元素的时候，那么上面的循环就会结束
            //表示已经找到了基准数在数组中应存入的位置
            //基准数归位
            //就是拿着这个范围中的第一个数字， 跟start指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;

        //往左边进行
        quickSort(arr,i,start-1);
        //往右边进行
        quickSort(arr,start+1,j);

        }
    }




