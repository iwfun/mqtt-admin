package com.iwfun.mqtt.admin.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author darin
 */
@Data
@ConfigurationProperties(prefix = "spring.mqtt.admin")
public class AdminProperties {
    private String username;
    private String password;
}
