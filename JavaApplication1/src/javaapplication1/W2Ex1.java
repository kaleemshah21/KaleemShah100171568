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
 * @author 100171568
 */
public class W2Ex1 {

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
        int newAge = (yearnow - yearofbirth);
        if (newAge >=18){
            System.out.println("you are above 18");
            
        }
        else{
            System.out.println("you are below 18");
        }
    }
    
}
