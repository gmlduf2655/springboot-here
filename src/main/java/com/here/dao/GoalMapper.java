package com.here.dao;

import com.here.dto.GoalDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoalMapper {

    List<GoalDto> selectGoalList(GoalDto param);

    GoalDto selectGoal(GoalDto param);

    List<GoalDto> selectGoalCategoryList();

    int saveGoal(GoalDto param);

    int deleteGoal(GoalDto param);

    List<GoalDto> selectGoalItemList(GoalDto param);

    List<GoalDto> selectGoalItemFrequencyList();

    int saveGoalItem(GoalDto param);

    int deleteGoalItem(GoalDto param);
}
