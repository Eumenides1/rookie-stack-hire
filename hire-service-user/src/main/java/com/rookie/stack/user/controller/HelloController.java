package com.rookie.stack.user.controller;

import com.rookie.stack.common.grace.result.GraceJSONResult;
import com.rookie.stack.common.grace.result.ResponseStatusEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/u")
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        return new GraceJSONResult(ResponseStatusEnum.SUCCESS, "Hello World!");
    }


}
