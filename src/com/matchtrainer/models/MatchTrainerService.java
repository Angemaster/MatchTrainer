package com.matchtrainer.models;

import java.sql.Connection;
import java.util.List;

public class MatchTrainerService extends BaseEntity{
    private CustomersEntity customersEntity;

    /* Conexion con la tabla Customer */

    protected CustomersEntity getCustomersEntity() {
        if(getConnection() != null) {
            if(customersEntity == null) {
                customersEntity = new CustomersEntity();
                customersEntity.setConnection(getConnection());
            }
        }
        return customersEntity;
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
    public Customer createCustomer(String name) {
        return getCustomersEntity() != null ?
                getCustomersEntity().create(name) : null;
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
}
