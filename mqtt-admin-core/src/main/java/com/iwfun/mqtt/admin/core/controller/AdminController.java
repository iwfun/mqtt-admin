package com.iwfun.mqtt.admin.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author darin
 */
@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "redirect:/dashboard";
    }








}
