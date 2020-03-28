package com.daily.work.dao.impl;

import com.daily.work.dao.ActivityDao;
import com.daily.work.domain.Activity;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ActivityDaoImpl implements ActivityDao {

    @Override
    public List<Activity> getActivityList() {
        List<Activity> activities = new ArrayList<Activity>();
        Activity activity1 = new Activity("Premiere connexion au poste de travail", LocalDateTime.now());
        Activity activity2 = new Activity("Reprise apres la pause de 10H", LocalDateTime.now().plusHours(3));
        Activity activity3 = new Activity("Reprise apres la pause dejeuner", LocalDateTime.now().plusHours(4).plusMinutes(30));
        activities.add(activity1);
        activities.add(activity2);
        activities.add(activity3);
        return activities;
    }
}
