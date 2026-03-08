package com.here.service;

import com.here.dao.TimeBoxMapper;
import com.here.dto.BrainDumpDto;
import com.here.dto.TimeTableDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TimeBoxService {

    private final TimeBoxMapper timeBoxMapper;

    public TimeBoxService(TimeBoxMapper timeBoxMapper) {
        this.timeBoxMapper = timeBoxMapper;
    }

    // Brain Dump
    public List<BrainDumpDto> selectBrainDumpList(BrainDumpDto param) {
        return timeBoxMapper.selectBrainDumpList(param);
    }

    public int saveBrainDump(BrainDumpDto param) {
        if (param.getDumpId() == null || param.getDumpId().isEmpty()) {
            param.setDumpId(UUID.randomUUID().toString());
        }
        return timeBoxMapper.saveBrainDump(param);
    }

    public int deleteBrainDump(BrainDumpDto param) {
        return timeBoxMapper.deleteBrainDump(param);
    }

    // Time Table
    public List<TimeTableDto> selectTimeTableList(TimeTableDto param) {
        return timeBoxMapper.selectTimeTableList(param);
    }

    public int saveTimeTable(TimeTableDto param) {
        if (param.getTimeTableId() == null || param.getTimeTableId().isEmpty()) {
            param.setTimeTableId(UUID.randomUUID().toString());
        }
        return timeBoxMapper.saveTimeTable(param);
    }

    public int deleteTimeTable(TimeTableDto param) {
        return timeBoxMapper.deleteTimeTable(param);
    }
}
