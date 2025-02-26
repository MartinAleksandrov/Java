package com.course.project.myacoolapp.rest;

import com.course.project.myacoolapp.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    public CricketCoach cricketCoach;

    @Autowired
    public FunRestController(CricketCoach cricketCoach) {

        this.cricketCoach = cricketCoach;
    }


    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamname;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "RUNNNNNN";
    }

    @GetMapping("/test")
    public String test() {
        return "This is just test";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach " + coachName + " Team " + teamname;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkouts(){
        return cricketCoach.getDailyWorkout();
    }

}
