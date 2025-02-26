package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {
    public RugbyCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play rugby ";
    }
}
