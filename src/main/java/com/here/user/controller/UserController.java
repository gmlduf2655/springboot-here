package com.here.user.controller;

import com.here.user.dto.UserDto;
import com.here.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/selectUserList")
    public List<UserDto> selectUserList(UserDto param) {
        return userService.selectUserList(param);
    }

    @GetMapping("/selectUser")
    public List<UserDto> selectUser(UserDto param) {
        return userService.selectUser(param);
    }

    @GetMapping("/loginUser")
    public List<UserDto> loginUser(UserDto param) {
        return userService.loginUser(param);
    }

    @GetMapping("/selectUserCnt")
    public List<UserDto> selectUserCnt(UserDto param) {
        return userService.selectUserCnt(param);
    }

    @PostMapping("/save")
    public int save(@RequestBody UserDto param) {
        return userService.saveUser(param);
    }

    @PostMapping("/updateUserPwd")
    public int updateUserPwd(@RequestBody UserDto param) {
        return userService.updateUserPwd(param);
    }
}
