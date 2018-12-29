package com.xcy.gmall.user.service.impl;

import com.xcy.gmall.user.bean.UserInfo;
import com.xcy.gmall.user.mapper.UserInfoMapper;
import com.xcy.gmall.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xcy
 * @Description
 * @Date 2018/12/29 17:02
 * @Version 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoList() {
        List<UserInfo> userInfoList = userInfoMapper.selectAll();
        return userInfoList;
    }
}
