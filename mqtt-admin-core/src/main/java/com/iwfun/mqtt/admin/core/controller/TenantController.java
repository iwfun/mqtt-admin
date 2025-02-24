package com.iwfun.mqtt.admin.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author darin
 */
@Controller
public class TenantController {
    @GetMapping("/tenants")
    public String tenants() {
        return "tenants";
    }
}
