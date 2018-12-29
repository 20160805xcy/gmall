package com.xcy.gmall.user.controller;

import com.xcy.gmall.user.bean.UserInfo;
import com.xcy.gmall.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xcy
 * @Description
 * @Date 2018/12/29 16:53
 * @Version 1.0
 */
@RestController
@RequestMapping("userInfo")
public class UserController {


    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("getUserInfoList")
    private List<UserInfo> getUserInfoList(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }

}
