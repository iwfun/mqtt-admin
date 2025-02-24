package com.iwfun.mqtt.admin.core.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * id          bigint auto_increment primary key,
 * username    varchar(100) not null,
 * password    varchar(200) not null,
 * is_admin    tinyint(1)   not null,
 * create_time datetime     null,
 * update_time datetime     null,
 *
 * @author darin
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private Boolean isAdmin;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
