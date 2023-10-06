/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import helpers.InputReader;
import java.util.Scanner;
/**
 *
 * @author shahk
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int choice = 3;
        String menu = "\n 1.)Add a new song \n 2.)Remove a song \n 3.)Print a list of all the songs stored \n 4.)print a list of songs over a certain number of plays \n 0.) Exit";
        
        while (choice!=0){
            System.out.println(menu + "\n" + "enter your choice (1 2 3, etc): ");
            choice = myObj.nextInt();
            if (choice == 1){
                System.out.println("u typed 1");
            }
            else if (choice == 2){
                System.out.println("u typed 2");
            }
            else if (choice == 3){
                System.out.println("u typed 3");
            }
            else if (choice == 4){
                System.out.println("u typed 4");
            }
            else if (choice == 0){
                System.out.println("u typed 0 so the program will quit");
            }
            else{
                System.out.println("invalid entry");
            }
        }
        
        
    }
    
}
