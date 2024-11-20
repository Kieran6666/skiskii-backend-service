package com.skiskii.skiskiibackendservice.task;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

/**
 * 明文加密
 */
public class Jasypt {

    @Test
    public void generate() {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("96e060fa-d3a0-b694-e0de-d44dbbc689fd");
        String encrypt = encryptor.encrypt("123456");
        System.err.println(encrypt);
        String decrypt = encryptor.decrypt(encrypt);
        System.err.println(decrypt);
    }
}
