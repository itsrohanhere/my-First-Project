package com.myApplication.my.First.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

class MyClass {

    @GetMapping("abc")
    public String sayHello() {
        return "Hello World";
    }
}
