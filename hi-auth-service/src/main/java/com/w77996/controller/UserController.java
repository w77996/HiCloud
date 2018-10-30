package com.w77996.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * <p>必须要有，做验证</p>
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:10:43
 * ProjectName:Mirco-Service-Skeleton
 */
@RestController
@Slf4j
public class UserController {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        log.info("enter UserController");
        return user;
    }
}
