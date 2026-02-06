package com.here.memo.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class MemoCsvDto {

    @CsvBindByName(column = "MEMO_ID")
    private String memoId;

    @CsvBindByName(column = "TITLE")
    private String title;

    @CsvBindByName(column = "MEMO_CONTENT")
    private String memoContent;

    @CsvBindByName(column = "REG_DATE")
    private String regDate;

    @CsvBindByName(column = "USER_ID")
    private String userId;
}