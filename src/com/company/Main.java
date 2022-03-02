package com.company;

import java.util.ArrayList;

public class Main {
  static ArrayList<Bank> banks = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        System.out.println("1. main");
        Bank bank1 = new Bank("Lollandsbanken", "Maribo");
        Bank bank2 = new Bank("Danske Bank", "København");
        banks.add(bank1);
        banks.add(bank2);

        bank1.startDialog();
        System.out.println(bank1.customers);

    }


}
