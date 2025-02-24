package com.iwfun.mqtt.admin.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author darin
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "redirect:/admin";
    }
}
