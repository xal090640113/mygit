package com.xal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/myuser")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUser")
    public Map<String,Object> getUser(){
        ResponseEntity<Map> result = restTemplate.exchange("http://xal-server1/user/getUser",HttpMethod.POST,null,Map.class);
        Map m = result.getBody();
        return m;
    }
}
