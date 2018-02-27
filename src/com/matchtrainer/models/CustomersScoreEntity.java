package com.matchtrainer.models;

import java.sql.SQLException;
import java.util.Date;

public class CustomersScoreEntity extends BaseEntity {

    public CustomerScore create(CustomerScore customerScore) {
        if(getConnection() != null) {
            try {
                java.util.Date date = new Date();
                java.sql.Date fechaActual = new java.sql.Date(date.getTime());

                String query = "INSERT INTO customerscore(trainer_id,startnumber,commentary) VALUES('"+ customerScore.getTrainerId() +"','"+ customerScore.getStarNumber() +"' , '"+ customerScore.getCommentary()+"')";
                getConnection().createStatement().execute(query);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }

}
