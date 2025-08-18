package com.java.AI_Guardian.message.disaster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message/disaster")
public class EmergencyMessageController {

    @GetMapping
    public String disaster() {
        return "Emergency Message";
    }
}
