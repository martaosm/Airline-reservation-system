/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercises;

import com.mycompany.exercises.model.model;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<model> tab = new ArrayList<>();
        
        ArrayList<model> bookedFlights = new ArrayList<>();
        
        int totalPrice = 0;
        //String choice = "bob";
        Object selectedValue1 = "Boo";
                
        while(selectedValue1!="End"){
            
        Object[] values1 = {"Book a flight", "Show my booked flights", "End"};
        selectedValue1 = JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null, values1, values1[0]);
        
        if(selectedValue1=="Book a flight"){
        String start = JOptionPane.showInputDialog("Start destination: ");
        String end = JOptionPane.showInputDialog("End destination: ");

        for(int i=0;i<10;i++){
            model flight = new model(end);
            tab.add(flight);
        }
        
        String[] displayArray = new String[tab.size()];
        for(int i=0;i<10;i++){
            System.out.println("Date: " + tab.get(i).date + ", Hour: " + tab.get(i).hour + ", Flight number: " + tab.get(i).flight_number + ", Price: " + tab.get(i).price + ", Duration: " + tab.get(i).duration + "h");
            String display = "Date: " + tab.get(i).date + ", Hour: " + tab.get(i).hour + ", Flight number: " + tab.get(i).flight_number + ", Price: " + tab.get(i).price + ", Duration: " + tab.get(i).duration + "h";
            displayArray[i]=display;
        }
        
        model[] tab2 = new model[tab.size()];
        for(int i=0;i<tab.size();i++){
            tab2[i]=tab.get(i);
        }
        Object[] values = displayArray;
        Object selectedValue = JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
        
        for(int i=0;i<tab.size();i++){
            if(selectedValue == displayArray[i]){
                bookedFlights.add(tab.get(i));
                break;
            }
        }
        tab.clear();
        }
        if(selectedValue1=="Show my booked flights"){
        //System.out.println("-------------------------------------------------\nBooked flights: ");
        String bF="";
        for(int i=0;i<bookedFlights.size();i++){
            bF = bF+"Date: " + bookedFlights.get(i).date + ", Hour: " + bookedFlights.get(i).hour + ", Flight number: " + bookedFlights.get(i).flight_number + ", Price: " + bookedFlights.get(i).price + ", Duration: " + bookedFlights.get(i).duration + "h\n";
            //System.out.println("Date: " + bookedFlights.get(i).date + ", Hour: " + bookedFlights.get(i).hour + ", Flight number: " + bookedFlights.get(i).flight_number + ", Price: " + bookedFlights.get(i).price + ", Duration: " + bookedFlights.get(i).duration + "h");
        }

        for(int i=0;i<bookedFlights.size();i++){
            totalPrice = totalPrice + bookedFlights.get(i).price;
        }
        
        System.out.println("Your total: " + totalPrice);
        JOptionPane.showMessageDialog(null, bF + "Your total: " + totalPrice, "Booked flights", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
}
