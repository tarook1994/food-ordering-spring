package com.example.demo.Database.DAO;

import com.example.demo.Database.Entities.Customer;

import java.util.List;

public interface CustomerDAO {

     Customer getCustomerByID(int id);
     List<Customer> getAllCustomers();
     void deleteCustomer(int id);
     void updateCustomer(int id);


}
