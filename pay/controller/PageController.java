package com.pay.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.concurrent.TimeUnit;



@Controller
public class PageController {

    private static final Logger log= LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){

        return page;
    }
}
