package org.moguri.goal.repository;

import org.apache.ibatis.annotations.Mapper;
import org.moguri.goal.domain.Goal;

@Mapper
public interface GoalMapper {

    Goal getGoal(long goalId);

    void create(Goal goal);

    long update(Goal goal);

    long delete(long goalId);

}
