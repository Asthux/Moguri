package org.moguri.goal.service;

import lombok.RequiredArgsConstructor;
import org.moguri.common.enums.ReturnCode;
import org.moguri.exception.MoguriLogicException;
import org.moguri.goal.domain.Goal;
import org.moguri.goal.param.GoalCreateParam;
import org.moguri.goal.param.GoalUpdateParam;
import org.moguri.goal.repository.GoalMapper;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class GoalService {

    final private GoalMapper goalMapper;

    public Goal getGoal(Long goalId) {
        Goal goal = goalMapper.getGoal(goalId);
        return Optional.ofNullable(goal)
                .orElseThrow(() -> new MoguriLogicException(ReturnCode.NOT_FOUND_ENTITY));
    }

    public void update(GoalUpdateParam param) {
        Optional.ofNullable(param.getGoalId())
                .orElseThrow(() -> new MoguriLogicException(ReturnCode.NOT_FOUND_ENTITY));
        goalMapper.update(param);
    }

    public void create(GoalCreateParam param) { //goal
        Goal goal = param.toEntity();
        goalMapper.create(goal);
    }

    public void delete(long goalId) {
        Optional.ofNullable(goalId)
                .orElseThrow(() -> new MoguriLogicException(ReturnCode.NOT_FOUND_ENTITY));
        goalMapper.delete(goalId);
    }
}
