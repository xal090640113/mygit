package com.xal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public Map<String,Object> getUser(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("name","安路");
        result.put("sex","男");
        result.put("age",26);
        result.put("address","湖南郴州市");
        return result;
    }
}
