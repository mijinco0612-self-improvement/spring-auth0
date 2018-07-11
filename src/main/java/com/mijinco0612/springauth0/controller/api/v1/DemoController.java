package com.mijinco0612.springauth0.controller.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @ResponseBody
    @GetMapping(value = "/api/v1/public")
    public String publicApi() {
        return "public";
    }

    @ResponseBody
    @GetMapping("/api/v1/private")
    public String privateApi() {
        return "private";
    }

    @ResponseBody
    @GetMapping("/api/v1/echo")
    public String echoApi(@RequestParam("echoMessage") String message) {
        return "pong!"+message;
    }
}