package com.matchtrainer.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedulesEntity extends BaseEntity {

    private static String DEFAULT_SQL = "SELECT * FROM matchtrainer.schedule";


        public Schedule create(Schedule schedule) {
        if(getConnection() != null) {
            try {
                java.util.Date date = new Date();
                java.sql.Date fechaActual = new java.sql.Date(date.getTime());

                String query = "INSERT INTO schedule(trainer_id,weekday,starttime,endtime,enabled) VALUES('"+ schedule.getTrainer_id() +"','"+ schedule.getWeekday() +"' , '"+ schedule.getStarttime()+"','"+ schedule.getEndtime()+"','"+ schedule.getEnabled() +"')";
                getConnection().createStatement().execute(query);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return  null;
    }

    private List<Schedule> findByCriteria(String sql) {
        List<Schedule> schedules;
        if(getConnection() != null) {
            schedules = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    Schedule schedule = new Schedule();
                    schedule.setId(resultSet.getInt("id"));
                    schedule.setTrainer_id(resultSet.getInt("trainer_id"));
                    schedule.setEnabled(resultSet.getBoolean("enabled"));
                    schedules.add(schedule);
                }
                return schedules;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<Schedule> findAll() {
        return findByCriteria(DEFAULT_SQL);
    }
}
