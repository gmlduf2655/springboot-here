package com.here.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MandalartDto {

    private String cellId;
    private String mandalartId;
    private String userId;
    private String regDate;
    private String lvl;
    private String cellRow;
    private String cellCol;
    private String mandalartContent;
    private String mandalartTitle;
    private String startDate;
    private String endDate;
}
