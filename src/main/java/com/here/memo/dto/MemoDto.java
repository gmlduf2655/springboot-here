package com.here.memo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoDto {

    private String memoId;
    private String userId;
    private String userName;
    private String regDate;
    private String title;
    private String memoContent;
    private String startDate;
    private String endDate;
}