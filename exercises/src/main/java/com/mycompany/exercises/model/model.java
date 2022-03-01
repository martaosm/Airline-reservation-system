/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercises.model;

/**
 *
 * @author marta
 */
public class model {
    public String date;
    public String hour;
    public String flight_number;
    public int price;
    //String start;
    //String end;
    public int duration;
    
    
    public void generateDateHour(){
        int day = 1 + (int)(Math.random() * ((30 - 1) + 1));
        int month = 3 + (int)(Math.random() * ((12 - 3) + 1));
        int year = 2022 + (int)(Math.random() * ((2023 - 2022) + 1));
        date = day + "." + month + "." + year;  
        int hour1 = 1 + (int)(Math.random() * ((24 - 1) + 1));
        int minutes = 0 + (int)(Math.random() * ((59 - 0) + 1));
        if(minutes<10){
            hour = hour1 + ":0" + minutes;
        }
        else{
            hour = hour1 + ":" + minutes;
        }
    }
    
    public void generateNumber(String end1){
        String code = end1.substring(0, 2);
        String code1 = code.toUpperCase();
        int number = 1000 + (int)(Math.random() * ((3000 - 1000) + 1));
        flight_number = code1 + number;    
    }
    
    public void generatePriceDuration(){
        price = 100 + (int)(Math.random() * ((1000 - 100) + 1));
        duration = 1 + (int)(Math.random() * ((6 - 1) + 1));
    }
    
    public model(String end1){
        generateDateHour();
        generateNumber(end1);
        generatePriceDuration();
    }
}
