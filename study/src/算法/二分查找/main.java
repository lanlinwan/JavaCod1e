package 算法.二分查找;

public class main {
    static int[] arr={1,5,8,11,19,22,31,35,40,45,48,49,50};
    public static void main(String[] args) {
        //二分查找:
        //   核心:每次排除一半的查找范围
        //   前提条件:排好序的数组
        //   过程:
        //   1. left和right表示当 前要查找的范围
        //   2. m是在left和right中间的
        //   3. 如果要查找的元素在m的左边，缩小范围时，left不变， right等于m减1
        //   4. 如果要查找的元素在m的右边， 缩小范围时，right不变， left等于m加1

        //中间值: 奇数二分取中间
        //       偶数二分取中间靠左
        // n个数求最多几次能找到: (log2 n)+1 ||  (log10 n/log10 2)+1

        binarySearch(105);
    }


    public static void binarySearch(int num){
        int left=0;
        int right=arr.length-1;


        while (left <= right){
            //中间值
            int m = left/2 + right/2;//都 /2 不会出现 整数溢出问题
            System.out.println(m);
            //
            if(arr[m] > num){
                right=m -1 ;
            }else if (arr[m] < num){
                left=m+1;
            }else {
                System.out.println("找到了,"+num+"在索引为"+m+"位置上");
                break;
            }

        }


    }

}
