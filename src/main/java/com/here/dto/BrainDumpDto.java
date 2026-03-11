package com.here.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrainDumpDto {

    private String dumpId;
    private String tboxDate;
    private String userId;
    private String dumpTitle;
    private String dumpContent;
    private String goalId;
    private String priorityYn;
    private String completeYn;
    private String status;
    private String regId;
    private String regDt;
    private String updId;
    private String modDt;

    // 조회 필터용
    private String startDate;
    private String endDate;

    // 일괄 삭제용
    private List<String> dumpIds;
}
