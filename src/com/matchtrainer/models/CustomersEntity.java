package com.matchtrainer.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CustomersEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM matchtrainer.customer";


    public Customer create(String firstName, String lastName,String gender, int age) {
            if(getConnection() != null) {
                try {
                    java.util.Date date = new Date();
                    java.sql.Date fechaActual = new java.sql.Date(date.getTime());


                    String query = "INSERT INTO customer(user_id,district_id,firstname,lastname,gender,age,registrationdate) VALUES('"+ 1 +"','"+ 1 +"' , '"+ firstName +"','"+ lastName +"','"+ gender +"','"+ age +"','"+ fechaActual+"')";
                    getConnection().createStatement().execute(query);
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        return null;
    }
    /*
    private List<Region> findByCriteria(String sql) {
        List<Region> regions;
        if(getConnection() != null) {
            regions = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    Region region = new Region()
                            .setId(resultSet.getInt("region_id"))
                            .setName(resultSet.getString("region_name"));
                    regions.add(region);
                }
                return regions;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<Region> findAll() {
        return findByCriteria(DEFAULT_SQL);
    }

    public Region findById(int id) {
        List<Region> regions = findByCriteria(DEFAULT_SQL +
                " WHERE region_id = "+ String.valueOf(id));
        return (regions != null ? regions.get(0) : null);
    }

    public Region findByName(String name) {
        List<Region> regions = findByCriteria(DEFAULT_SQL +
                " WHERE region_name = '" + name + "'");
        return (regions != null ? regions.get(0) : null);
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

    public boolean delete(int id) {
        return updateByCriteria("DELETE FROM regions WHERE region_id = " + String.valueOf(id)) > 0;
    }

    private int getMaxId() {
        String sql = "SELECT MAX(region_id) AS max_id FROM regions";
        if(getConnection() != null) {
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                return resultSet.next() ?
                        resultSet.getInt("max_id") : 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return 0;
    }

    public Region create(String name) {
        if(findByName(name) == null) {
            if(getConnection() != null) {
                String sql = "INSERT INTO regions(region_id, region_name) VALUES(" +
                        String.valueOf(getMaxId() + 1) + ", '" +
                        name + "')";
                int results = updateByCriteria(sql);
                if(results > 0) {
                    Region region = new Region(getMaxId(), name);
                    return region;
                }
            }
        }
        return null;
    }

    public boolean update(Region region) {
        if(findByName(region.getName()) != null) return false;
        return updateByCriteria(
                "UPDATE regions SET region_name = '" +
                        region.getName() + "'" +
                        " WHERE region_id = " +
                        String.valueOf(region.getId())) > 0;
    }
    */
}
