package com.daily.work.controllers;

import com.daily.work.service.ActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActivityController {

    private ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @RequestMapping("/list")
    public String getActivities(Model model) {
        model.addAttribute("activities", activityService.getActivityList());
        return "activity/list";
    }
}
