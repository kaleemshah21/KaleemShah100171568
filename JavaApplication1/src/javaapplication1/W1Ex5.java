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
public class W1Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int reversed = 0;
        int reversed2=0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("enter the first number");
        int Num1 = myObj.nextInt();
        System.out.println("Enter second number");
        int Num2 = myObj.nextInt();
        System.out.println("in normal order "+ Num1 + " "+Num2);
        while (Num1!=0){
            int digit = Num1 % 10;
            reversed = reversed * 10 + digit;
            Num1/=10;
        
        
    }
        while (Num2!=0){
            int digit2 = Num2 % 10;
            reversed2 = reversed2 * 10 + digit2;
            Num2/=10;
            
                   
    }
        System.out.println("reversed "+ reversed);
        System.out.println("reversed "+ reversed2);
    }
    
}
