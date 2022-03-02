package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String city;
    private int employeeNum = 400;
    ArrayList<Customer> customers = new ArrayList<>();
    TextUI textUI;

    public Bank(String name, String city){
        this.name = name;
        this.textUI = new TextUI();
    }

    public void startDialog(){
        int choice=0;

        while(choice != 3){
            choice = textUI.showUserMenu();
            doAction(choice);
        }

    }

    private void displayCustomers(){

        for (Customer c:this.customers) {
            System.out.println(c);
        }


    }


    private void doAction(int choice){
        switch(choice) {
            case 1:
                // code block
                System.out.println("du har valgt at registrere kunde");
                this.registerCustomer();
                break;
            case 2:
                this.displayCustomers();
                // code block
                break;
            case 3:
                System.out.println("På gensyn!");
               break;
            default:
                // code block
        }
    }
    public void registerCustomer(){

        String name = textUI.getUserInput("Tast kundens navn:");
        //Bed om kundens alder
        int startAmount = Integer.parseInt(textUI.getUserInput("Tast kundens startbeløb:"));
        //tilføj kunde til banken med det navn brugeren har skrevet i konsollen
        addCustomer(name, startAmount);

    }
    @Override
    public String toString(){
        String space = "\n";
        String s = this.name +space+ this.city+space+ this.employeeNum;
        return s;
    }

    public void addCustomer(String name, int startAmount){
        Customer c = new Customer(name, startAmount);
        customers.add(c);
    }

}
