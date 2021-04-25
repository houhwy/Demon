package com.example.servl;

public class HelloS01 extends HelloS{
    @Override
    public void doGet() {
        System.out.println("01的get");
    }

    @Override
    public void doPost() {
        System.out.println("01的post");
    }
}
