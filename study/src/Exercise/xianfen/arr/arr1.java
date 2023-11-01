package Exercise.xianfen.arr;

import java.util.Arrays;

public class arr1 {
    static int[] arr={1,15,25,33,36,41,45,52,56,60,66,70,71,78,80,90,100,452,666,699,780};
    static int[] arr1={1,343,36,46,52,56,6,1,78,0,90,10,452,66,699,7};

    public static void main(String[] args) {
        //二分查找
        er(10);
        //冒泡排序
        mp();
    }

    private static void mp() {
        int m=0;
        for (int j = 0; j < arr1.length-1; j++) {
            for (int i = 0; i < arr1.length-1-j; i++) {
                if (arr1[i]>arr1[i+1]){
                    m=arr1[i];
                    arr1[i]=arr1[i+1];
                    arr1[i+1]=m;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
    }

    private static void er(int num) {
        int left=0;
        int right=arr.length-1;
        efcz(left,right,num);

    }

    private static void efcz(int left,int right,int num) {
        if ( left>right){
            System.out.println("没有找到");
            return;
        }
        int zj=(left+right)/2;
        if (arr[zj]==num){
            System.out.println("找到了"+num+"这个数,在数组索引为"+zj+"处");
        } else if (arr[zj]>num){
            efcz(left,zj-1,num);
        } else if (arr[zj]<num){
            efcz(zj+1,right,num);
        }




    }
}
