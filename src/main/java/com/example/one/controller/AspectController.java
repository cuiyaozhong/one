package com.example.one.controller;

import com.example.one.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 崔耀中
 * @since 2020-08-12
 */
@Slf4j
@RestController
@RequestMapping("/aspect")
public class AspectController {

    @GetMapping
    public Result aspect(String message){
        log.info("aspect controller");
        return Result.sucess(message);

    }

    @GetMapping("/sleep/{time}")
    public Result sleep(@PathVariable("time") long time) {
        log.info("sleep");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            log.error("error",e);
        }
        if (time == 1000) {
            throw new RuntimeException("runtime exception");
        }
        log.info("wake up");
        return Result.sucess("wake up");

    }
}
