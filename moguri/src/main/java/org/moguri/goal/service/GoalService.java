package org.moguri.goal.service;

import lombok.RequiredArgsConstructor;
import org.moguri.common.enums.ReturnCode;
import org.moguri.exception.MoguriLogicException;
import org.moguri.goal.domain.Goal;
import org.moguri.goal.param.GoalCreateParam;
import org.moguri.goal.repository.GoalMapper;
<<<<<<< HEAD

=======
>>>>>>> b4cc6ea05a22db71db03ca6c1a82c3f6fded48e2
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
<<<<<<< HEAD
public class GoalService{
=======
public class GoalService {
>>>>>>> b4cc6ea05a22db71db03ca6c1a82c3f6fded48e2

    final private GoalMapper goalMapper;

    public Goal getGoal(Long goalId) {
        Goal goal = goalMapper.getGoal(goalId);
        return Optional.ofNullable(goal)
                .orElseThrow(() -> new MoguriLogicException(ReturnCode.NOT_FOUND_ENTITY));
    }

<<<<<<< HEAD
    public Goal update(Goal goal){
        goalMapper.update(goal);
        return getGoal(goal.getGoalId());
    }
    //gpt
    public Goal create(GoalCreateParam param){
=======
    public Goal update(Goal goal) {
        goalMapper.update(goal);
        return getGoal(goal.getGoalId());
    }

    public Goal create(GoalCreateParam param) {
>>>>>>> b4cc6ea05a22db71db03ca6c1a82c3f6fded48e2
        Goal goal = param.toEntity();
        goalMapper.create(goal);
        return getGoal(goal.getGoalId());
    }

<<<<<<< HEAD
    public Goal delete(Long goalId){
=======
    public Goal delete(Long goalId) {
>>>>>>> b4cc6ea05a22db71db03ca6c1a82c3f6fded48e2
        Goal goal = getGoal(goalId);
        goalMapper.delete(goalId);
        return goal;
    }
}

