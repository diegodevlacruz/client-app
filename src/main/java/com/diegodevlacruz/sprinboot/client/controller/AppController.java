package com.diegodevlacruz.sprinboot.client.controller;

import com.diegodevlacruz.sprinboot.client.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Map;


@Controller
public class AppController {

    @GetMapping("/list")
    public List<Message> list() {
        return Collections.singletonList(new Message("Test List"));
    }

    @PostMapping("/create")
    public Message create(@RequestBody Message message) {
        System.out.println("Saved Message: " + message);
        return message;
    }

    public Map<String, String> authorized(@RequestParam String code) {
        return Collections.singletonMap("code", code);
    }

}
