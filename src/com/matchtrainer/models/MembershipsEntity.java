package com.matchtrainer.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    private List<Membership> findByCriteria(String sql) {
        List<Membership> memberships;
        if(getConnection() != null) {
            memberships = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    Membership membership = new Membership();
                    membership.setId(resultSet.getInt("id"));
                    membership.setCustomerId(resultSet.getInt("customer_id"));
                    membership.setEnabled(resultSet.getBoolean("enabled"));
                    memberships.add(membership);
                }
                return memberships;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<Membership> findAll() {
        return findByCriteria(DEFAULT_SQL);
    }
}
