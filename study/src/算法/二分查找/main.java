package 算法.二分查找;

public class main {
    static int[] arr={1,28,66,88,90,98,105,115,120,140};
    public static void main(String[] args) {
        //二分查找:
        //   核心:每次排除一半的查找范围
        //   前提条件:排好序的数组
        //   过程:
        //   1. min和max表示当 前要查找的范围
        //   2. mid是在min和max中间的
        //   3. 如果要查找的元素在mid的左边，缩小范围时，min不变， max等于mid减1
        //   4. 如果要查找的元素在mid的右边， 缩小范围时，max不变， min等于mid加1
        int min=0;
        int max=arr.length-1;
        binarySearch(105,min,max);
    }


    public static void binarySearch(int num,int min,int max){

        while (true){
            if(min>max){
                System.out.println("没有");
                return;
            }
            int median=(min+max)/2;
            if(num<arr[median]){
                max=median-1;
            }else if(num>arr[median]){
                min=median+1;
            }else if(min==max){
                System.out.println("找到了在数组索引为"+median);
                break;
            }
        }
    }

}
