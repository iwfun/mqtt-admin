package com.iwfun.mqtt.admin.core.enums;

import lombok.Getter;

/**
 * 1:readonly, 2:writeonly ,3:readwrite ,4:subscribe
 *
 * @author darin
 */
@Getter
public enum Permission {
    READ_ONLY(1),
    WRITE_ONLY(2),
    READ_WRITE(3),
    SUBSCRIBE(4);

    private final int value;

    Permission(int value) {
        this.value = value;
    }
}
