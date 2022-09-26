package 算法.二分查找;

public class modified {
    //插值查找
    //改进方案:
    //      1.使用回调函数
    //      2.median=min + (key-arr[min]) / (arr[max]-arr[min]) * (max-min)
    //       用百分比 使中间值 尽可能的靠近要查找的值


    //改进后的适用场景: 数组的值波动较小
    static int[] arr={1,3,5,6,9,10,12,15,16,17};
    public static void main(String[] args) {
        int min=0;
        int max=arr.length-1;
        binarySearch(12,min,max);
    }


    public static void binarySearch(int num,int min,int max){
            if(min>max){
                System.out.println("没有");
                return;
            }
            int median=min + (num-arr[min]) / (arr[max]-arr[min]) * (max-min);
            if(num<arr[median]){
                max=median-1;
                binarySearch( num, min, max);
            }else if(num>arr[median]){
                min=median+1;
                binarySearch( num, min, max);
            }else {
                System.out.println("找到了在数组索引为"+median);
            }
    }
}
