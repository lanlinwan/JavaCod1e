package Jedis;

import redis.clients.jedis.Jedis;
import util.JedisConnectionFactory;

public class jedis {

    public static void main(String[] args) {
        //连接redis
        //jedis=new Jedis("127.0.0.1",6379);
        //根据连接池连接redis
        Jedis jedis = JedisConnectionFactory.getJedis();
        //jedis.auth("");
        jedis.select(0);

        String re= jedis.set("lname","lan");
        System.out.println(re);
        String name= jedis.get("lanme");
        System.out.println(name);

        jedis.close();
    }

}
