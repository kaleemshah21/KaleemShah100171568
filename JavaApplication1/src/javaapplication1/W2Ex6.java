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
        Boolean confirmation = false;
        
        do{
            System.out.println("enter the times table you want to see");
            int multiply = myObj.nextInt();
        
            for(int count=1; count<14;count++){
            System.out.println(count +" x "+ multiply +" = "+count*multiply);
            }
            
            System.out.println("would you like to try another number?(yes or no): ");
            String restart = myObj.nextLine();
            if(restart.equals("yes")){
                confirmation = true;
            }
            
        }
        while (confirmation);
        System.out.println("Goodbye");
    }
    
}
