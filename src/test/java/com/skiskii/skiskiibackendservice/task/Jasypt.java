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
        // password与application-dev.properties中的jasypt.encryptor.password保持一致
        encryptor.setPassword("xxxxxxxx");
        String encrypt = encryptor.encrypt("123456");
        System.err.println(encrypt);
        String decrypt = encryptor.decrypt(encrypt);
        System.err.println(decrypt);
    }
}
