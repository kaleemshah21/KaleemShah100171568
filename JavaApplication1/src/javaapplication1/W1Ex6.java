/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import java.util.*;
import java.time.*;
/**
 *
 * @author shahk
 */
public class W1Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yearnow = Year.now().getValue(); //gets current year as an integer
        Scanner myObj = new Scanner(System.in); 
        System.out.println("enter your age");
        int age = myObj.nextInt();
        int yearofbirth = (yearnow - age); // subtracts the age from current year to get the year of birth
        System.out.println("you were born in: "+ yearofbirth);
        
        
        
        
    }
    
}
