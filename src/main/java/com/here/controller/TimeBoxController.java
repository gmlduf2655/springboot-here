package com.here.controller;

import com.here.dto.BrainDumpDto;
import com.here.dto.TimeTableDto;
import com.here.service.TimeBoxService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timebox")
public class TimeBoxController {

    private final TimeBoxService timeBoxService;

    public TimeBoxController(TimeBoxService timeBoxService) {
        this.timeBoxService = timeBoxService;
    }

    // Brain Dump
    @GetMapping("/selectBrainDumpList")
    public List<BrainDumpDto> selectBrainDumpList(BrainDumpDto param) {
        return timeBoxService.selectBrainDumpList(param);
    }

    @PostMapping("/saveBrainDump")
    public int saveBrainDump(@RequestBody BrainDumpDto param) {
        return timeBoxService.saveBrainDump(param);
    }

    @PostMapping("/deleteBrainDump")
    public int deleteBrainDump(@RequestBody BrainDumpDto param) {
        return timeBoxService.deleteBrainDump(param);
    }

    @PostMapping("/deleteBrainDumpList")
    public int deleteBrainDumpList(@RequestBody BrainDumpDto param) {
        return timeBoxService.deleteBrainDumpList(param);
    }

    // Time Table
    @GetMapping("/selectTimeTableList")
    public List<TimeTableDto> selectTimeTableList(TimeTableDto param) {
        return timeBoxService.selectTimeTableList(param);
    }
    // Time Table
    @GetMapping("/selectWeeklyTimeTableList")
    public List<TimeTableDto> selectWeeklyTimeTableList(TimeTableDto param) {
        return timeBoxService.selectWeeklyTimeTableList(param);
    }

    @GetMapping("/selectTimeTableByDumpId")
    public List<TimeTableDto> selectTimeTableByDumpId(TimeTableDto param) {
        return timeBoxService.selectTimeTableByDumpId(param);
    }

    @PostMapping("/saveTimeTable")
    public int saveTimeTable(@RequestBody TimeTableDto param) {
        return timeBoxService.saveTimeTable(param);
    }

    @PostMapping("/deleteTimeTable")
    public int deleteTimeTable(@RequestBody TimeTableDto param) {
        return timeBoxService.deleteTimeTable(param);
    }
}
