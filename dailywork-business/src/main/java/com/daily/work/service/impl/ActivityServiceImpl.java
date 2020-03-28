package com.daily.work.service.impl;

import com.daily.work.dao.ActivityDao;
import com.daily.work.domain.Activity;
import com.daily.work.service.ActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    public ActivityServiceImpl(ActivityDao activityDao) {
        this.activityDao = activityDao;
    }

    private ActivityDao activityDao;


    @Override
    public List<Activity> getActivityList() {
        return activityDao.getActivityList();
    }
}
