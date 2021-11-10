package org.omos.redis.server;

import org.omos.redis.RedisUtil;
import redis.clients.jedis.Jedis;

import java.util.List;

public class UserServcie {

    public static void main(String[] args) {
        Jedis jedis = RedisUtil.INSTANCE.getInstance();

        while (true) {
            List<String> list = jedis.blpop(0, "key");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
}
