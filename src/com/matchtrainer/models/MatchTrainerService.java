package com.matchtrainer.models;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class MatchTrainerService {
    private Connection connection;
    private CustomersEntity customersEntity;
    private DistrictsEntity districtsEntity;

    private Connection getConnection() {
        if (connection == null)  {
            try {
                connection = ((DataSource) InitialContext
                        .doLookup("jdbc/MySQLDataSource"))
                        .getConnection();
            } catch (NamingException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    protected CustomersEntity getCustomersEntity() {
        if(getConnection() != null) {
            if(customersEntity == null) {
                customersEntity = new CustomersEntity();
                customersEntity.setConnection(getConnection());
            }
        }
        return customersEntity;
    }

    protected DistrictsEntity getDistrictsEntity() {
        if(getConnection() != null) {
            if(districtsEntity == null) {
                districtsEntity = new DistrictsEntity();
                districtsEntity.setConnection(getConnection());
            }
        }
        return districtsEntity;
    }

/*
    public List<Customer> findAllCustomers() {
        return getCustomersEntity() != null ?
                getCustomersEntity().findAll() : null;
    }

    public Customer findCustomerById(int id) {
        return getCustomersEntity() != null ?
                getCustomersEntity().findById(id) : null;
    }

    public Customer findCustomerByName(String name) {
        return getCustomersEntity() != null ?
                getCustomersEntity().findByName(name) : null;
    }
*/
    public Customer createCustomer(int distritoId,String firstName, String lastName,String gender,int age) {
        return getCustomersEntity() != null ?
                getCustomersEntity().create(distritoId,firstName,lastName,gender,age) : null;
    }
/*
    public boolean deleteCustomer(int id) {
        return getCustomersEntity() != null ?
                getCustomersEntity().delete(id) : false;
    }

    public boolean updateCustomer(Customer customer) {
        return getCustomersEntity() != null ?
                getCustomersEntity().update(customer) : false;
    }
    */

    public List<District> findAllDistricts() {
        return getDistrictsEntity() != null ?
                getDistrictsEntity().findAll() : null;
    }
}
