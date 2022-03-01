package com.company;
import java.util.Scanner;
public class Main {
    static Bank bank;

    public static void main(String[] args) {
        // write your code here
        bank = new Bank("Lollandsbanken");
        String name = getUserInput("Tast kundens navn:");
       //Bed om kundens alder
        int age = Integer.parseInt(getUserInput("Tast kundens alder:"));

        //tilføj kunde til banken med det navn brugeren har skrevet i konsollen
        bank.addCustomer(name, age);

         System.out.println(bank.customers.get(0).getName()+": "+age);

    }

    static String getUserInput(String msg) {
        //Scanner intans og kald til nextLine
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        return input;
    }
}
