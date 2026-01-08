package com.here.memo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoDto {

    private Long memoId;
    private String userId;
    private String name;
    private String regDate;
    private String title;
    private String memoContent;

}