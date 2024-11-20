package com.skiskii.skiskiibackendservice;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.spring.annotation.MapperScan;

@EnableEncryptableProperties // JASYPT解密用
@MapperScan(basePackages = "com/skiskii/skiskiibackendservice/mapper")
@SpringBootTest
class SkiskiiBackendServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
