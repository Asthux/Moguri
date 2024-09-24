package org.moguri.goal.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.moguri.goal.domain.Goal;

import java.math.BigDecimal;
import java.util.Date;
<<<<<<< HEAD
=======

>>>>>>> b4cc6ea05a22db71db03ca6c1a82c3f6fded48e2
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GoalCreateParam {
    private String goalName;
    private BigDecimal goalAmount;
    private BigDecimal currentAmount;
    private Date startDate;
    private Date endDate;

<<<<<<< HEAD
    public Goal toEntity(){
=======
    public Goal toEntity() {
>>>>>>> b4cc6ea05a22db71db03ca6c1a82c3f6fded48e2
        Goal goal = Goal.builder()
                .goalName(goalName)
                .goalAmount(goalAmount)
                .currentAmount(currentAmount)
                .startDate(startDate)
                .endDate(endDate).build();
        return goal;
    }
}
