package com.elvin.loan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Haifeng Pang.
 * @Description:
 * @CreatedTime: 2017/11/9 下午5:55
 * @ModifiedBy:
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getUser(){

        return "user";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminUser(){
        return "adminUser";
    }
}
