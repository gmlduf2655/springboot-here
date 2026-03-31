package com.here.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeTableDto {

    private String timeTableId;
    private String dumpId;
    private String tboxDate;
    private String userId;
    private Integer timeHour;
    private Integer timeMinute;
    private String color;
    private String regId;
    private String regDt;
    private String updId;
    private String modDt;

    // Brain Dump 조인 필드 (selectTimeTableList 결과용)
    private String dumpTitle;
    private String priorityYn;
    private String status;

    // 조회조건
    private String startDate;
    private String endDate;
}
