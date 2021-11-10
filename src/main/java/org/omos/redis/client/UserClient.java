package org.omos.redis.client;

import org.omos.redis.RedisUtil;
import redis.clients.jedis.Jedis;

import java.util.Scanner;

public class UserClient {

    public static void main(String[] args) {
        Jedis jedis = RedisUtil.INSTANCE.getInstance();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();
            jedis.rpush("key", value);
            System.out.println("key:" + value);
        }

    }

}
