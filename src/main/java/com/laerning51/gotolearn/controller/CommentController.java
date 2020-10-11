package com.laerning51.gotolearn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class CommentController {

    @GetMapping("/")
    public String post(){
        return "hello";
    }
    @GetMapping("/post")
    public List<Account> all (){
        return accountService.list();
    }
    @PostMapping("/account")
    public Account create (@RequestBody Account account){
        return accountService.create(account);
    }

    @GetMapping("/account/{accountId}")
    public Account get (@PathVariable Long accountId){
        return accountService.get(accountId);
    }

    @PutMapping("/account/{accountId}")
    public Account update (@RequestBody Account account, @PathVariable Long accountId){
        return accountService.update(account, accountId);
    }

}
