/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.time.Year;
import java.time.*;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
//NOT FINISHED, ISSUE SEEMS TO BE THAT THE .GETDAYS() METHOD ONLY GETS DAYS FROM CURRENT DAY ALL DAYS FROM CURRENT DAY.
/**
 *
 * @author shahk
 */
public class W1Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //gets the local date
        LocalDate today = LocalDate.now();
        int yearnow = Year.now().getValue();
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter your date of birth(dd-mm-yyyy)");
        String DOB = myObj.nextLine();
        //splits the string entered with -
        String[] data = DOB.split("-");
        //converts the string values to integers
        int day = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);
        //converts birthDate to local date format so can be used in the period.between.
        LocalDate birthDate = LocalDate.of(year,month,day);
        //gets the period of days between the dates
        int daysOld = Period.between(birthDate,today).getDays();
        System.out.println(today + " " + birthDate);
        System.out.println("you are: "+ daysOld);
        
    }
    
}
