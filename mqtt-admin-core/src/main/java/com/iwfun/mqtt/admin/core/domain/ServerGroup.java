package com.iwfun.mqtt.admin.core.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author darin
 */
@Data
public class ServerGroup {
    private Long id;
    private String name;
    private String code;
}
