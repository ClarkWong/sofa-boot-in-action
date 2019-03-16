package com.github.xuyuanwang.sofabootinaction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @RequestMapping("/sample")
    public String sampleController() {
        return "Hello, SOFABoot!";
    }

}