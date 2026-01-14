package com.here.user.dao;

import com.here.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserDto> selectUserList(UserDto User);

    List<UserDto> selectUser(UserDto User);

    List<UserDto> loginUser(UserDto User);

    List<UserDto> selectUserCnt(UserDto User);

    int saveUser(UserDto User);

    int insertUser(UserDto User);

    int updateUser(UserDto User);

    int updateUserPwd(UserDto User);
}