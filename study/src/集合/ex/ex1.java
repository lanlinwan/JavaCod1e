package 集合.ex;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
           /*需求
    定义一个Map集合，键用表示省份名称province,值表示市city， 但是市会有多个。
    添加完毕后，遍历结果格式如下:
    江苏省=南京市，扬州市，苏州市，无锡市，常州市
    湖北省=武汉市，孝感市，十堰市，宜昌市。鄂州市
    河北省=石家庄市，唐山市，邢台市，保定市，张家口市
*/

        //1.c创建Map集合
        HashMap<String, ArrayList<String>> hm=new HashMap<>();

        //2.创建单例集合储存市
        ArrayList<String> city1 = new ArrayList<>();
        city1. add("南京市");
        city1. add("扬州市");
        city1. add("苏州市");
        city1. add("无锡市");
        city1. add("常州市");
        ArrayList<String> city2 = new ArrayList<>();
        city2. add("武汉市");
        city2. add("孝感市");
        city2. add("十堰市");
        city2. add("宜昌市");
        city2. add("鄂州市");
        ArrayList<String> city3 = new ArrayList<>();
        city3. add("石家庄市");
        city3. add("孝感市");
        city3.add(" +堰市");
        city3. add("宜昌市");
        city3. add("鄂州市");

        //3.把省份 市 添加到Map中
        hm.put("江苏省",city1);
        hm.put("湖北省",city2);
        hm.put("河北省",city3);

        //遍历
        /*江苏省=南京市，扬州市，苏州市，无锡市。常州市
            湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
            河北省=石家庄市，唐山市，邢台市，保定市，张家口市*/

        //获取 Map集合 所有 键值对对象
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        //entry 依次表示 每一个键值对对象
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key=entry.getKey();
            ArrayList<String> value=entry.getValue();

            StringJoiner sj=new StringJoiner(",","","");
            for (String v : value) {
                sj.add(v);
            }
            System.out.println(key + "=" + sj);
        }

    }



}
