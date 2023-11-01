package 集合.双列集合.map.TreeMap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class ex1 {
    public static void main(String[] args) {
        /**
        *需求:字符串“aababcabcdabcde”
        请统计字符串中每一“个字 符出现的次数，并按照以下格式输出
        输出结果:
        a(5)b(4)c(3)d(2)e(1)

        新的统计思想:利用map集 合进行统计
        如果题目中没有要求对结果进行排序，默认使用HashMap
        如果题目中要求对结果进行排序，请使用TreeMap
        键:表示要统计的内容
        值:表示次数
        */

        String s="aababcabcdabcde";

        TreeMap<Character,Integer> tm=new TreeMap<>();

        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //获取字符
            char c=s.charAt(i);

            //判断 集合中 是否存在 c字符
            if(tm.containsKey(c)){
                //存在 把次数拿出来 +1 并 添加回
                int count =tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                //不存在
                tm.put(c,1);
            }
        }

        //遍历集合 并 拼接字符串
        StringBuilder sb=new StringBuilder();

        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });

        //简写
        tm.forEach((key,value)-> sb.append(key).append("(").append(value).append(")"));

    }
}
