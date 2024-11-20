package com.skiskii.skiskiibackendservice.utils;

import java.util.Random;

/**
 * 随机码工具类
 */
public final class RandomUtils {
    /**
     * 单例
     */
    private static RandomUtils instance;

    /**
     * 打开接入口
     *
     * @return instance
     */
    public static synchronized RandomUtils getInstance() {
        if (null == instance) {
            instance = new RandomUtils();
        }
        return instance;
    }

    /**
     * 定义随机码范围
     */
    private static final String[] CHARS = new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"};

    /**
     * 生成随机码
     *
     * @param length 长度
     * @return random
     */
    public String createRandom(int length) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int currentIndex = random.nextInt(CHARS.length);
            sb.append(CHARS[currentIndex]);
        }

        return sb.toString();
    }
}
