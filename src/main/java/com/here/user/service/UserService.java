package com.here.user.service;

import com.here.user.dao.UserMapper;
import com.here.user.dto.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserDto> selectUserList(UserDto param) {
        return userMapper.selectUserList(param);
    }

    public List<UserDto> selectUser(UserDto param) {
        return userMapper.selectUser(param);
    }

    public List<UserDto> loginUser(UserDto param) {
        return userMapper.loginUser(param);
    }

    public List<UserDto> selectUserCnt(UserDto param) {
        return userMapper.selectUserCnt(param);
    }

    public int saveUser(UserDto param) {
        return userMapper.saveUser(param);
    }

    public int updateUserPwd(UserDto param) {
        return userMapper.updateUserPwd(param);
    }
}
