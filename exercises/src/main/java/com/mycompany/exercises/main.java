/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercises;

import com.mycompany.exercises.model.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



/**
 *
 * @author marta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Start location: ");
        String start = myObj.nextLine();
        System.out.println("End location: ");
        String end = myObj.nextLine();
        
        ArrayList<model> tab = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            model flight = new model(end);
            tab.add(flight);
        }
        
        for(int i=0;i<10;i++){
            System.out.println("Date: " + tab.get(i).date + ", Hour: " + tab.get(i).hour + ", Flight number: " + tab.get(i).flight_number + ", Price: " + tab.get(i).price + ", Duration: " + tab.get(i).duration + "h");
        }
        /*long aDay = TimeUnit.DAYS.toMillis(1);
        long now = new Date().getTime();
        Date hundredYearsAgo = new Date(now + aDay * 365);
        Date random = RandomDates.between(now, hundredYearsAgo);
        assertThat(random).isBetween(now, hundredYearsAgo);*/
    }
    
}
