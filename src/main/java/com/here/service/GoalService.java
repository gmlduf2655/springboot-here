package com.here.service;

import com.here.dao.GoalMapper;
import com.here.dto.GoalDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GoalService {

    private final GoalMapper goalMapper;

    public GoalService(GoalMapper goalMapper) {
        this.goalMapper = goalMapper;
    }

    public List<GoalDto> selectGoalList(GoalDto param) {
        return goalMapper.selectGoalList(param);
    }

    public GoalDto selectGoal(GoalDto param) {
        return goalMapper.selectGoal(param);
    }

    public List<GoalDto> selectGoalCategoryList() {
        return goalMapper.selectGoalCategoryList();
    }

    public int saveGoal(GoalDto param) {
        if (param.getGoalId() == null || param.getGoalId().isEmpty()) {
            param.setGoalId(UUID.randomUUID().toString());
        }
        return goalMapper.saveGoal(param);
    }

    public int deleteGoal(GoalDto param) {
        return goalMapper.deleteGoal(param);
    }

    public List<GoalDto> selectGoalItemList(GoalDto param) {
        return goalMapper.selectGoalItemList(param);
    }

    public List<GoalDto> selectGoalItemFrequencyList() {
        return goalMapper.selectGoalItemFrequencyList();
    }

    public int saveGoalItem(GoalDto param) {
        if (param.getItemId() == null || param.getItemId().isEmpty()) {
            param.setItemId(UUID.randomUUID().toString());
        }
        return goalMapper.saveGoalItem(param);
    }

    public int deleteGoalItem(GoalDto param) {
        return goalMapper.deleteGoalItem(param);
    }
}
