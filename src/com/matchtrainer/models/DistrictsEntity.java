package com.matchtrainer.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DistrictsEntity extends BaseEntity {
 private static String DEFAULT_SQL = "SELECT * FROM district";

    private List<District> findByCriteria(String sql) {
        List<District> districts;
        if(getConnection() != null) {
            districts = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    District district = new District();
                    district.setId(resultSet.getInt("id"));
                    district.setName(resultSet.getString("name"));
                    districts.add(district);
                }
                return districts;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<District> findAll() {
        return findByCriteria(DEFAULT_SQL);
    }
}
