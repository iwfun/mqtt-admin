package com.iwfun.mqtt.admin.core.domain;

import com.iwfun.mqtt.admin.core.enums.Permission;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Id          bigint auto_increment primary key,
 * user_id     bigint       not null,
 * topic       varchar(200) not null,
 * permission  tinyint      not null comment '1:readonly, 2:writeonly ,3:readwrite ,4:subscribe ',
 * create_time datetime     null,
 * update_time datetime     null
 *
 * @author darin
 */
@Data
public class Acl {
    private Long id;
    private Long userId;
    private String topic;
    private Permission permission;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
