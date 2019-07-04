package com.example.demo.Database.DAO;

import com.example.demo.Database.Entities.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    SessionFactory factory;

    @Override
    public Customer getCustomerByID(int id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void updateCustomer(int id) {

    }
}
