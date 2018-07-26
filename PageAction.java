package com.sun.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2018/7/17.
 */
@Controller
public class PageAction {
//    跳转到指定页面
    public String toPage(){
        return "page";
    }

}
