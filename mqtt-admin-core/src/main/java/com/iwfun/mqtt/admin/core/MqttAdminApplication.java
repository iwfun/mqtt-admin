package com.iwfun.mqtt.admin.core;

import com.iwfun.mqtt.admin.core.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Darin.ldr
 * @since 2023/05/01
 */
@Slf4j
@EnableScheduling
@SpringBootApplication
@MapperScan(basePackageClasses = UserMapper.class)
public class MqttAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqttAdminApplication.class, args);
    }
}
