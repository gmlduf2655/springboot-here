package com.here.controller;

import com.here.dto.GoalDto;
import com.here.service.GoalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goal")
public class GoalController {

    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping("/selectGoalList")
    public List<GoalDto> selectGoalList(GoalDto param) {
        return goalService.selectGoalList(param);
    }

    @GetMapping("/selectGoal")
    public GoalDto selectGoal(GoalDto param) {
        return goalService.selectGoal(param);
    }

    @GetMapping("/selectGoalCategoryList")
    public List<GoalDto> selectGoalCategoryList() {
        return goalService.selectGoalCategoryList();
    }

    @PostMapping("/saveGoal")
    public int saveGoal(@RequestBody GoalDto param) {
        return goalService.saveGoal(param);
    }

    @PostMapping("/deleteGoal")
    public int deleteGoal(@RequestBody GoalDto param) {
        return goalService.deleteGoal(param);
    }

    @GetMapping("/selectGoalItemList")
    public List<GoalDto> selectGoalItemList(GoalDto param) {
        return goalService.selectGoalItemList(param);
    }

    @GetMapping("/selectGoalItemFrequencyList")
    public List<GoalDto> selectGoalItemFrequencyList() {
        return goalService.selectGoalItemFrequencyList();
    }

    @PostMapping("/saveGoalItem")
    public int saveGoalItem(@RequestBody GoalDto param) {
        return goalService.saveGoalItem(param);
    }

    @PostMapping("/deleteGoalItem")
    public int deleteGoalItem(@RequestBody GoalDto param) {
        return goalService.deleteGoalItem(param);
    }
}
