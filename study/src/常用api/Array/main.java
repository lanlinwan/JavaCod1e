package 常用api.Array;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        //public static String toString(数组) 把数组拼接成一一个字符串

        //public static int binarySearch(数组，查找的元素) 二分查找法查找元素
        //public static int[] copyOf(原数组，新数组长度) 拷贝数组
        //public static int[] copyOfRange(原数组，起始索引，结束索引) 拷贝数组( 指定范围)
        //public static void fill(数组，元素) 填充数组，
        //public static boolean equals(arr,arr) 比较数组元素是否相等
        //public static void sort(数组) 按照默认方式进行数组排序
        //public static void sort(数组，排序规则) 按照指定的规则排序
        //            sort(arr,String.CASE_INSENSITIVE_ORDER) 忽略大小写,字母表排序


        //tostring:将数组变成字符串
        System.out.println("--------------toString- ");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //binarySearch:二分查找法查找元素
        //细节:二分查找的前提:数组中的元素必须是有序，数组中的元素必须是升序的
        //细节2:如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，返回的是-插入点- 1
        //疑问:为什么要减1呢?
        //解释:如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
        //如果要查找数字0，此时0是不存在的，但是按照上面的规则-插入点，应该就是-日
        //为了避免这样的情况，Java在这个基础上又减一。
        System.out.println("---------------binarySer-------------------");
        System.out.println(Arrays.binarySearch(arr, 10));//9
        System.out.println(Arrays.binarySearch(arr, 2));//1
        System.out.println(Arrays.binarySearch(arr, 20));//-11 I

        //copyOf:拷贝数组
        System.out.println("--------------------------------");
        int[] newArr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr1));

        //copyOfRange:拷贝数组(指定范围)
        //细节:包头不包尾,包左不包右
        System.out.println("----------------copy0fRan--------------------");
        int[] newArr2 = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(newArr2));

        //fill:填充数组
        System.out.println("---------------fill---- ");
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        // sort 排序:默认使用升序排序,底层使用快速排序
        System.out.println("----------------sort--------------------");
        int[] arr2={10,55,23,88,76,15,86,23,56};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // sort 自定义规则

        //第二个参数是一一个接口，所以我们在调用方法的时候，需要传递这个接口的实现类对象，作为排序的规则。
        //但是这个实现类，我只要使用一一次， 所以就没有必要单独的去写一一个类， 直接采取匿名内部类的方式就可以了
        //底层原理:
        //利用插入排序+二分查找的方式进行排序的。
        //默认把0索引的数据当做是有序的序列，1索引到最后认为是无序的序列。
        //遍历无序的序列得到里面的每一一个元素，假设当前遍历得到的元素是A元素
        //把A往有序序列中进行插入，在插入的时候，是利用: 二分查找确定A元素的插入点。
        //拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体
        //如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
        //如果方法的返回值是正数，拿着A继续跟后面的数据进行比较
        //如果方法的返回值是0，也拿着A跟后面的数据进行比较
        //.直到能确定A的最终位置为止。
        // compare方法的形式参数:
        //参数一o1:表示在 无序序列中，遍历得到的每一-个元素
        //参数二o2:有序序列中的元素
        //返回值:
        //负数:表示当前要插入的元素是小的，放在前面
        //正数:表示当前要插入的元素是大的，放在后面
        //0:表示当前要插入的元素跟现在的元素比是- *样的们也会放在后面

        //o1-o2 表示 升序 反之 降序

        Integer[] arr1={23,12,12,66,95,45,83,26};
        Arrays.sort(arr1,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(arr1[0]);

    }
}
