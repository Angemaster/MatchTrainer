package com.matchtrainer.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationsEntity extends BaseEntity{
    String state;

    private List<Reservation> findByCriteria(String sql) {
        List<Reservation> reservations;
        if(getConnection() != null) {
            reservations = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    Reservation reservation = new Reservation();

                    reservation.setTrainingPurpose(resultSet.getString("trainingpurpose"));
                    reservation.setState(resultSet.getString("state"));
                    reservation.setLastName(resultSet.getString("lastname"));
                    reservation.setFirstName(resultSet.getString("firstname"));
                    reservation.setCommentary(resultSet.getString("commentary"));
                    reservation.setHour(resultSet.getString("hour"));
                    reservation.setMeetingDate(resultSet.getDate("meetingdate"));
                    reservation.setAddress(resultSet.getString("address"));
                    reservation.setTrainingLevel(resultSet.getString("traininglevel"));
                    reservation.setTraininPlace(resultSet.getString("trainingplace"));

                    reservations.add(reservation);
                }
                return reservations;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public List<Reservation> findById(int id) {
        String query="SELECT re.trainingpurpose as trainingpurpose, re.traininglevel as traininglevel, re.trainingplace as trainingplace, re.meetingdate as meetingdate, re.address as address, re.hour as hour, re.state as state, re.commentary as commentary,tablaA1.firstname as firstname,tablaA1.lastname as lastname FROM reservation as re INNER JOIN customer as tablaA1 on tablaA1.id = re.trainer_id INNER JOIN customer as tablaA2 on tablaA2.id = re.visitor_id WHERE re.visitor_id="+ id;
        return findByCriteria(query);
    }
    private List<Reservation> findByCriteriaTrainer(String sql) {
        List<Reservation> reservations;
        if(getConnection() != null) {
            reservations = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    Reservation reservation = new Reservation();
                    reservation.setId(resultSet.getInt("id"));
                    reservation.setVisitorId(resultSet.getInt("visitor_id"));
                    reservation.setFirstName(resultSet.getString("firstname"));
                    reservation.setLastName(resultSet.getString("lastname"));
                    reservation.setHour(resultSet.getString("hour"));
                    reservation.setMeetingDate(resultSet.getDate("meetingdate"));
                    reservation.setTraininPlace(resultSet.getString("trainingplace"));
                    reservation.setTrainingPurpose(resultSet.getString("trainingpurpose"));
                    reservation.setTrainingLevel(resultSet.getString("traininglavel"));
                    //reservation.setPhotoName(resultSet.getString("photoname"));
                    //reservation.setPhotoUrl(resultSet.getString("photourl"));
                    reservations.add(reservation);
                }
                return reservations;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public List<Reservation> findByTrainerId(int trainerId) {
        String query="SELECT re.visitor_id as visitor_id, re.address as address ,re.meetingdate as meetingdate,re.trainingplace as trainingplace,re.trainingpurpose as trainingpurpose,re.traininglevel as traininglevel,re.hour as hour ,tablaA2.firstname as firstname,tablaA2.lastname as lastname , tablaA2.registrationdate as registrationdate , tablaA2.photoname as photoname,tablaA2.photourl as photourl FROM reservation as re INNER JOIN customer as tablaA1 on tablaA1.id = re.trainer_id INNER JOIN customer as tablaA2 on tablaA2.id = re.visitor_id WHERE re.state=En proceso AND re.trainer_id=" + trainerId;
        return findByCriteriaTrainer(query);
    }
    public boolean updateCommentary(Reservation reservation) {
        state="Rechazado";
        return updateByCriteria(

                "UPDATE reservation SET state= '"+ state +"',commentary= '"+ reservation.getCommentary() +"' where id="+reservation.getId()) > 0;
    }
    public boolean updateState(Reservation reservation) {

        return updateByCriteria(
                "UPDATE reservation SET state = '" + reservation.getState()  + "' where = " + reservation.getId() ) > 0;
    }

    private int updateByCriteria(String sql) {
        if(getConnection() != null) {
            try {
                return getConnection()
                        .createStatement()
                        .executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}