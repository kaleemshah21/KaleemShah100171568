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
public class W1Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number");
        float Num1 = myObj.nextFloat(); //gets the value entered as an float and stores it as a float with variable of Num1
        System.out.println("Enter second number");
        float Num2 = myObj.nextFloat();
        System.out.println("the average is "+ (Num1+Num2)/2);
        
        
        
    }
    
}
