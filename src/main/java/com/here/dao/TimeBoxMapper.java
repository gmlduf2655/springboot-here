package com.here.dao;

import com.here.dto.BrainDumpDto;
import com.here.dto.TimeTableDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TimeBoxMapper {

    // Brain Dump
    List<BrainDumpDto> selectBrainDumpList(BrainDumpDto param);
    int saveBrainDump(BrainDumpDto param);
    int deleteBrainDump(BrainDumpDto param);
    int deleteBrainDumpList(BrainDumpDto param);

    // Time Table
    List<TimeTableDto> selectTimeTableList(TimeTableDto param);
    List<TimeTableDto> selectTimeTableByDumpId(TimeTableDto param);
    int saveTimeTable(TimeTableDto param);
    int deleteTimeTable(TimeTableDto param);
}
