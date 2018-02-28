package com.matchtrainer.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationsEntity extends BaseEntity{

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
}
