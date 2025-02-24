package com.iwfun.mqtt.admin.core.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * id           varchar(36)                          not null,
 * name         varchar(32)                          null,
 * username     varchar(32)                          not null,
 * password     varchar(64)                          not null,
 * domain       varchar(32)                          null,
 * topic_prefix varchar(32)                    null,
 * client_limit int                                  null,
 * is_enable    tinyint(1) default 1                 not null,
 * create_time  datetime   default CURRENT_TIMESTAMP not null,
 * update_time  datetime   default CURRENT_TIMESTAMP not null
 *
 * @author darin
 * @date 2019/3/13
 */
@Data
public class Tenant {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String domain;
    private String topicPrefix;
    private Integer clientLimit;
    private Boolean isEnable;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
