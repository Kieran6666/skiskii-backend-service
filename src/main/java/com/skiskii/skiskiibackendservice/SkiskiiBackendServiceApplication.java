package com.skiskii.skiskiibackendservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 */
@MapperScan(basePackages = "com/skiskii/skiskiibackendservice/mapper")
@SpringBootApplication
public class SkiskiiBackendServiceApplication {
    /**
     * 启动类
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(SkiskiiBackendServiceApplication.class, args);
    }

}
