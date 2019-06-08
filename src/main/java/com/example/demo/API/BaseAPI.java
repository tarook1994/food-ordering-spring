package com.example.demo.API;


import com.example.demo.Entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseAPI {
    @Autowired
    SessionFactory sessionFactory;

    private static final ThreadLocal<Session> threadLocal = new ThreadLocal();

    @CrossOrigin
    @GetMapping("/")
    @Transactional
    public String baseGet(){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Customer c = (Customer) session.get(Customer.class, 1);
        session.getTransaction().commit();
        closeSession();
        return c+"";
    }

    public void closeSession(){
        Session session = threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }
}
