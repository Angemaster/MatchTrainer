package com.matchtrainer.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM user";

    private List<User> findByCriteria(String sql) {
        List<User> users;
        if(getConnection() != null) {
            users = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    /*user.setProfileId(resultSet.getInt("profile_id"));
                    user.setEmail(resultSet.getString("email"));*/
                    users.add(user);
                }
                return users;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User findByEmailPassword(String email,String password) {
        List<User> users = findByCriteria(DEFAULT_SQL +
                "WHERE email='" + email + "' AND password= '" + password + "'");
        return (users != null ? users.get(0) : null);
    }
}
