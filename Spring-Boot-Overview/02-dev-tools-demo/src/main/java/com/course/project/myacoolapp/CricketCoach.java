package com.course.project.myacoolapp;

import com.course.project.myacoolapp.interfaces.ICricketCoach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICricketCoach {

    @Override
    public String getDailyWorkout() {
        return "Just run for 15 minutes";
    }
}
