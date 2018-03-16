package com.test.controller;

import com.test.domain.Category;
import com.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaobin.wang
 * @date 2018/2/24
 */
@Controller
@RequestMapping("/hello")
public class Hello {

    @Autowired
    CategoryService categoryService;

    @ResponseBody
    @RequestMapping("/say")
    public Map say(String name) {
        System.out.println("hello" + name);
        Map map = new HashMap();
        map.put("ddd", "sss");
        return map;
    }

    @ResponseBody
    @RequestMapping("/findall")
    public List<Category> getCategory() {
        return categoryService.findAll();
    }

    @RequestMapping("/upload")
    @ResponseBody
    public void upload(MultipartFile file) throws IOException {
        file.transferTo(new File("D://12.txt"));
    }
}
