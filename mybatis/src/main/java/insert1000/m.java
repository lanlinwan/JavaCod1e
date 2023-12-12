package insert1000;


import mapper.ItemMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Item;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class m {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-1000-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //获取SqlSessionFactory对象,用于执行sql
        SqlSession sqlSession=sqLSessionFactory.openSession();

        //获取mapper 接口代理对象
        ItemMapper itemMapper=sqlSession.getMapper(ItemMapper.class);
        List<String> list=new ArrayList<>();
        list.add("爱华仕（OIWAS）飞机轮拉杆箱6182 商务出差旅行箱 大容量休闲旅游托运箱24英寸淡山茱菮粉（升级版）");
        list.add("小米8SE 全面屏智能游戏拍照手机 6GB+64GB 灰色 骁龙处理器 全网通4G 双卡双待");
        list.add("小米8 全面屏游戏智能手机 6GB+64GB 蓝色 全网通4G 双卡双待");
        list.add("小米14 全面屏游戏智能手机 512GB+1024GB 蓝色 ");

        for (int i = 1; i < 10; i++) {
            Item item=new Item();
            item.setId((long) i);
            Random random = new Random();
            int randomNumber = random.nextInt(10000) + 1;
            item.setPrice(randomNumber);
            item.setName(list.get(i%(list.size()+1)));
            itemMapper.insert1000(item);
        }

    }
}
