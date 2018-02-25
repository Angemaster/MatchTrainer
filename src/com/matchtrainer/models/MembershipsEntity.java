package com.matchtrainer.models;

import java.sql.SQLException;
import java.util.Date;

public class MembershipsEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM matchtrainer.membership";


    public Membership create(Membership membership) {
        if(getConnection() != null) {
            try {
                java.util.Date date = new Date();
                java.sql.Date fechaActual = new java.sql.Date(date.getTime());

                String query = "INSERT INTO membership(customer_id,membershiptype_id,paymmenttype_id,startdate,expirationdate,coachprice) VALUES('"+ membership.getCustomerId() +"','"+ membership.getMembershipTypeId() +"' , '"+ membership.getPaymentTypeId()+"','"+ membership.getStartDate()+"','"+ membership.getExpirationDate()+"','"+ membership.getCoachPrice() +"')";
                getConnection().createStatement().execute(query);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return  null;
    }
}
