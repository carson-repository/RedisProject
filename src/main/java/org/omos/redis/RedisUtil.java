package org.omos.redis;

import redis.clients.jedis.Jedis;

public enum  RedisUtil {
    INSTANCE;

    private Jedis instance;

    RedisUtil() {
        instance = new Jedis("192.168.60.128");
    }

    public Jedis getInstance() {
        return instance;
    }
}
