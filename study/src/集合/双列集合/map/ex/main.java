package 集合.双列集合.map.ex;

import java.util.*;

public class main {

    public static void main(String[] args) {
        //某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D) ,每个学生只
        //能选择一个景点，请统计出最终哪个景点想去的人数最多。

        //定义一个数组 储存4个景点
        String[] arr={"A","B","C","D"};
        //随机数模拟80个同学投票,并储存
        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            int index =r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //map 统计
        HashMap<String,Integer> hm=new HashMap<>();
        for (String name:list){
            //判断当前景点在map集合中是否存在
            if (hm.containsKey(name)){
                //存在
                //先获取当前景点被投票的次数,然后++
                int count=hm.get(name);
                count++;
                //新次数添加回集合中
                hm.put(name,count);
            }else {
                //不存在
                hm.put(name,1);
            }

        }

        //求最大值
        int max=0;
        Set<Map.Entry<String,Integer>> entrySet=hm.entrySet();
        for ( Map.Entry<String,Integer> entry:entrySet){
            int count=entry.getValue();
            if (count>max){
                max=count;
            }
        }

        System.out.println(max);

        //判断哪个景点与最大值一样,打印
        for ( Map.Entry<String,Integer> entry:entrySet){
            int count=entry.getValue();
            if (count==max){
                System.out.println(entry.getKey());;
            }
        }





    }
}
