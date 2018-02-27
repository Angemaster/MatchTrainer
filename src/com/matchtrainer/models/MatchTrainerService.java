package com.matchtrainer.models;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MatchTrainerService {
    private Connection connection;
    private CustomersEntity customersEntity;
    private DistrictsEntity districtsEntity;
    private UsersEntity usersEntity;
    private MembershipsEntity membershipsEntity;
    private SchedulesEntity schedulesEntity;

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

    protected UsersEntity getUsersEntity() {
        if(getConnection() != null) {
            if(usersEntity == null) {
                usersEntity = new UsersEntity();
                usersEntity.setConnection(getConnection());
            }
        }
        return usersEntity;
    }
    protected MembershipsEntity getMembershipsEntity() {
        if(getConnection() != null) {
            if(membershipsEntity == null) {
                membershipsEntity = new MembershipsEntity();
                membershipsEntity.setConnection(getConnection());
            }
        }
        return membershipsEntity;
    }

    protected SchedulesEntity getSchedulesEntity() {
        if(getConnection() != null) {
            if(schedulesEntity == null) {
                schedulesEntity = new SchedulesEntity();
                schedulesEntity.setConnection(getConnection());
            }
        }
        return schedulesEntity;
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
    public User createUser(User user) {
        return getUsersEntity() != null ? getUsersEntity().create(user) : null;
    }

    public Customer createCustomer(Customer customer) {
        return getCustomersEntity() != null ? getCustomersEntity().create(customer) : null;
    }

    public Membership createMembership(Membership membership) {
        return getMembershipsEntity() != null ? getMembershipsEntity().create(membership) : null;
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

    public List<Schedule> findAllSchedules() {
        return getSchedulesEntity() != null ? getSchedulesEntity().findAll() : null;
    }


    public List<District> findAllDistricts() {
        return getDistrictsEntity() != null ?
                getDistrictsEntity().findAll() : null;
    }

    public List<Customer> findAllCustomersByProfile(int profileId) {
        return getCustomersEntity() != null ? getCustomersEntity().findById(profileId) : null;
    }


    public List<Membership> findAllMemberships() {
        return getMembershipsEntity() != null ? getMembershipsEntity().findAll() : null;
    }

    public User findUserEmailPassword(String email,String password) {
        return getUsersEntity() != null ? getUsersEntity().findByEmailPassword(email,password) : null;
    }
}
