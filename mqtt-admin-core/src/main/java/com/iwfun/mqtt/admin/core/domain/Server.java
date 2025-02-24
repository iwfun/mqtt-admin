package com.iwfun.mqtt.admin.core.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author darin
 */
@Data
public class Server {
    private Long id;
    private String name;
    private String url;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
