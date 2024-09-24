package org.moguri.goal.repository;

<<<<<<< HEAD
import org.moguri.goal.domain.Goal;

public interface GoalMapper {
    public Goal getGoal(long goalId);

    public void create(Goal goal);

    public long update(Goal goal);

    public long delete(long goalId);
=======
import org.apache.ibatis.annotations.Mapper;
import org.moguri.goal.domain.Goal;

@Mapper
public interface GoalMapper {

    Goal getGoal(long goalId);

    void create(Goal goal);

    long update(Goal goal);

    long delete(long goalId);
>>>>>>> b4cc6ea05a22db71db03ca6c1a82c3f6fded48e2

}
