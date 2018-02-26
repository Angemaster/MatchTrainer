package com.matchtrainer.beans;
import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.Schedule;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SchedulesBean implements Serializable {

    private MatchTrainerService service;
    private Schedule schedule;

    public SchedulesBean() {
        service = new MatchTrainerService();
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public List<Schedule> getSchedules(){
        return service.findAllSchedules();
    }


    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }


    public int getId(){
        return this.getSchedule().getId();
    }

    public void setId(int id){
        this.getSchedule().setId(id);
    }

    public int getTrainerId(){
        return this.getSchedule().getTrainer_id();
    }

    public void setTrainerId(int id){
        this.getSchedule().setTrainer_id(id);
    }

    public String getWeekday(){
        return this.getSchedule().getWeekday();
    }

    public void setWeekday(String weekday){
        this.getSchedule().setWeekday(weekday);
    }

    public Date getStarttime(){
        return this.getSchedule().getStarttime();
    }

    public void setStarttime(Date starttime){
        this.getSchedule().setStarttime(starttime);
    }

    public Date getEndtime(){
        return this.getSchedule().getEndtime();
    }

    public void setEndtime(Date endtime){
        this.getSchedule().setEndtime(endtime);
    }

    public boolean getEnabled(){
        return this.getSchedule().getEnabled();
    }

    public void setEnabled(boolean enabled){
        this.getSchedule().setEnabled(enabled);
    }
}
