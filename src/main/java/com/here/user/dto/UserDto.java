package com.here.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int cnt;
    private String userId;
    private String userPwd;
    private String userName;
    private String regDate;
    private String email;
    private String address;

}