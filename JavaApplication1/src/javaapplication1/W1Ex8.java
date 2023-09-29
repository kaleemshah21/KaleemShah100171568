/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author shahk
 */
public class W1Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double conversion = 5280;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the number of feet you want to convert");
        int feet = myObj.nextInt();
        double miles = feet/conversion;
        //rounds the value x 100 so that it can get to 2dp
        double rounded = Math.round(miles*100);
        //divides value by 100 to get the true value again
        System.out.println(rounded/100);
        System.out.println(feet);
    }
    
}
