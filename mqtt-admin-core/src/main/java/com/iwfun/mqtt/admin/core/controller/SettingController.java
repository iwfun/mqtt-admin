package com.iwfun.mqtt.admin.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author darin
 */
@Controller
public class SettingController {
    @GetMapping("/settings")
    public String settings() {
        return "settings";
    }
}
