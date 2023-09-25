/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author shahk
 */
public class W1Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the money in savings account: ");
        double amountStart = myObj.nextDouble();
        System.out.println("enter the number of months");
        int months = myObj.nextInt();
        double amountEnd = amountStart * 0.01 * months;
        System.out.print("the amount at the end of the time period: ");
        System.out.print(amountEnd+amountStart);
        
        
    }
    
}
