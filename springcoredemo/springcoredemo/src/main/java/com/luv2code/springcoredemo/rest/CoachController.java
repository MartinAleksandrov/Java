package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.TennisCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class CoachController {

    private Coach coach;

    @Autowired
    public CoachController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        coach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
