package com.here.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalDto {

    // 목표
    private String goalId;
    private String userId;
    private String goalTitle;
    private String goalContent;
    private String startDate;
    private String targetDate;
    private String endDate;
    private String categoryId;
    private String categoryNm;
    private String status;
    private String regId;
    private String regDt;
    private String modId;
    private String modDt;

    // 목표 항목
    private String itemId;
    private String itemTitle;
    private String itemContent;
    private String itemFrequency;

    // 목표 항목 빈도
    private String itemFrequencyId;
    private String itemFrequencyNm;

    // 검색 조건
    private String yyyy;
    private String mm;
}
