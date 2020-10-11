package com.laerning51.gotolearn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class CommentController {

    @GetMapping("/")
    public String post(){
        return "hello";
    }
    

}
