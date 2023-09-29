/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 100171568
 */
public class W2Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        //Boolean confirmation = false;
        
        
        String userInput;

        do {
            System.out.println("enter the times table you want to see");
            int multiply = myObj.nextInt();
            
            myObj.nextLine();
        
            for(int count=1; count<14;count++){
            System.out.println(count +" x "+ multiply +" = "+count*multiply);
            }
            //
            System.out.println("Do you want to continue the loop? (yes/no): ");
            userInput = myObj.nextLine();

            // Check if the user wants to continue
            if (userInput.equalsIgnoreCase("no")) {
                break; // Exit the loop if the user enters "no"
            }
        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Loop ended.");
      
    }
}
