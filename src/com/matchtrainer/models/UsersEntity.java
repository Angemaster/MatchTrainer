package com.matchtrainer.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public User create(User user) {
        if(getConnection() != null) {
            try {
                String query = "INSERT INTO user(profile_id,email,password) VALUES('"+ user.getProfileId() +"','"+ user.getEmail() +"' , '"+ user.getPassword()+"')";
                PreparedStatement statement =getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                int affectRows = statement.executeUpdate();
                if (affectRows == 0){
                    throw new SQLException("No se pudo guardar");
                }

                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()){
                    int profileId = generatedKeys.getInt("id");
                    user.setId(profileId);
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }


    /*
createStatement () crea un objeto Statement basado en una cadena SQL totalmente calificada sin parámetros.
prepareStatement () crea un objeto PreparedStatement a partir de una SQL String parametrizada.
El uso de prepareState tiene una sobrecarga adicional en la base de datos la primera vez que se ejecuta. Por lo tanto, si solo necesita ejecutar la declaración una o dos veces para su aplicación, createStatement es la mejor manera de manejarla. Además, si los componentes de su cláusula where son dinámicos (es decir, puede agregar un calificador adicional a la cláusula where en función de la entrada del usuario), debe usar la declaración create.
Sin embargo, dado que el Objeto PreparedStatement se compila en la base de datos, le proporcionará un mejor rendimiento si necesita llamar repetidamente al SQL y solo cambia los valores en la cláusula where.
Nota: si siempre llama al mismo SQL, obtendrá el mejor rendimiento convirtiéndolo en un Procedimiento almacenado de SQL y llamándolo mediante el Objeto CallableStatement.*/
}
