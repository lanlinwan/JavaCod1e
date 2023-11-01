package File.ex1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ex6 {
    public static void main(String[] args) {
        //统计各文件数量
        File file=new File("D:\\JavaCode");
        System.out.println(getCount(file));
    }

    /**
     *
     * @param src 统计的文件夹
     *
     */
    private static HashMap<String,Integer> getCount(File src) {
        //集合统计数量,有映射的键值对 用Map
        HashMap<String,Integer> hashMap=new HashMap<>();
        //进入src文件夹
        File[] files=src.listFiles();
        //遍历文件
        for (File file : files) {
            //是文件就记录后缀名
            if (file.isFile()){
                //获取文件名
                String name= file.getName();
                //切割 . 后面的
                String[] ns=name.split("\\.");
                if (ns.length>=2){
                    String  lastName= ns[ns.length-1];
                    //判断这个后缀名 再集合中是否存在
                    if (hashMap.containsKey(lastName)){
                        //存在, 将次数拿出来 ++,并重写添加回去
                        Integer count=hashMap.get(lastName);
                        count++;
                        hashMap.put(lastName,count);
                    }else {
                        //不存在 就进行第一次添加
                        hashMap.put(lastName,1);
                    }
                }
            }else {
                //文件夹递归,得到 子文件夹下的 map<后缀名,数量>
                HashMap<String,Integer> ziHashMap=getCount(file);
                //遍历将文件名相同的数量拿出来累加,不同的直接添加
                Set<Map.Entry<String, Integer>> set=ziHashMap.entrySet();
                for (Map.Entry<String, Integer> entry : set) {
                    String key =entry.getKey();
                    Integer v=entry.getValue();
                    if (hashMap.containsKey(key)){
                        //文件夹 后缀名数量 + 子文件夹 后缀名数量
                        Integer count=hashMap.get(key);
                        count=count+v;
                         hashMap.put(key,count);
                    }else {
                        hashMap.put(key,v);
                    }
                }
            }
        }
        return hashMap;
    }
}
