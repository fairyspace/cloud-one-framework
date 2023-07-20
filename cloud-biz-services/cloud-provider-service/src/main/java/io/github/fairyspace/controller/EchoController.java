package io.github.fairyspace.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: cloud-one-framework
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/7/20
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
@RestController
@RequestMapping("/echo/")
@Slf4j
public class EchoController {
    @RequestMapping(value = "/ping/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "Hello,I am provider,you find me! " + string;
    }
}
