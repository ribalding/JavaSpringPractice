package com.ryanharvey.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ryan on 4/4/2017.
 */

@Controller
public class GifController {
    @RequestMapping("/")
    @ResponseBody
    public String listGifs() {
        return "LISTING SHIT BRO";
    }
}
