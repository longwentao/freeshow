package com.freeshow.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Write something ...
 * Created by mac.zhang on 14-10-28 下午1:07
 */
@Controller
@Slf4j
public class CheckPreload {
    @Autowired
    @RequestMapping("/checkpreload.htm")
    public @ResponseBody
    String checkpreload() {
        return "success";
    }
}
