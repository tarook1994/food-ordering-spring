package com.example.demo.Database.Entities;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_date")
    private Date date;

    @Column(name = "amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public Order(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Order() {
    }

   
}
