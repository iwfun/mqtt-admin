package com.iwfun.mqtt.admin.core.domain;


import lombok.Data;

import java.time.LocalDateTime;

/**
 * id            int auto_increment                 primary key,
 * admin_user_id int                                not null,
 * access_key    varchar(32)                        not null,
 * secret_key    varchar(64)                        not null,
 * expiry_time   datetime                           null,
 * create_time   datetime default CURRENT_TIMESTAMP not null,
 * update_time   datetime default CURRENT_TIMESTAMP not null,
 *
 * @author darin
 */
@Data
public class Token {
    private Long id;
    private String tenantId;
    private String accessKey;
    private String secretKey;
    private LocalDateTime expiryTime;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
