package org.moguri.goal.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Goal {
    private int goalId;
    private int memberID;
    private String goalName;
    private BigDecimal goalAmount;
    private BigDecimal currentAmount;
    private Date targetDate;
    private Date createdAt;
    private Date updatedAt;
}
