package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String city = "København";
    private int employeeNum = 400;
    ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        String space = "\n";
        String s = this.name +space+ this.city+space+ this.employeeNum;
        return s;
    }

    public void addCustomer(String name, int age){
        Customer c = new Customer(name, age);
        customers.add(c);
    }

}
