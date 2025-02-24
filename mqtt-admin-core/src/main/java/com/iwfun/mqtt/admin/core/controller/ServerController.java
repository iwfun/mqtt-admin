package com.iwfun.mqtt.admin.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author darin
 */
@Controller
public class ServerController {
    @GetMapping("/servers")
    public String devices() {
        return "servers";
    }
}
