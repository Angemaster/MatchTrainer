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
                    //reservation.setId(resultSet.getInt("id"));
                   // reservation.setFirstName(resultSet.getString("firstname"));
                    //reservation.setLastName(resultSet.getString("lastname"));
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
        String query="SELECT C.id AS id , C.firstname AS firstname , C.lastname AS lastname, C.photoname AS photoname , " +
                "C.photoUrl AS photoUrl FROM customer AS C INNER JOIN user AS U ON C.user_id = U.id where U.profile_id=" + id;
        return findByCriteria(query);
    }
}
