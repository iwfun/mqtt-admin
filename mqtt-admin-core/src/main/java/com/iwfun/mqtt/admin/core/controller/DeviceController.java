package com.iwfun.mqtt.admin.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author darin
 */
@Controller
public class DeviceController {
    @GetMapping("/devices")
    public String devices() {
        return "devices";
    }
}
