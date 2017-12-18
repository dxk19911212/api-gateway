package com.dxk.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/local/hello")
    public String hello() {
        return "this is zuul-local!";
    }

}