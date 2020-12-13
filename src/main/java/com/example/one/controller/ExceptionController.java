package com.example.one.controller;

import com.example.one.util.MessageEnum;
import com.example.one.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author 崔耀中
 * @since 2020-08-10
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @GetMapping("/runtimeexception")
    public Result runtimeException() {
        throw new RuntimeException();
    }

}
