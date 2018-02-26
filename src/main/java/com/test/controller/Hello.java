package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaobin.wang
 * @date 2018/2/24
 */
@Controller
@RequestMapping("/hello")
public class Hello {

    @ResponseBody
    @RequestMapping("/say")
    public Map say(String name) {
        System.out.println("hello" + name);
        Map map = new HashMap();
        map.put("ddd", "sss");
        return map;
    }
}
