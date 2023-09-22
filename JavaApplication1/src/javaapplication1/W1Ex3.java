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
public class W1Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Height");
        int height = myObj.nextInt();  // Read user input
        System.out.println("Enter Width");
        int width = myObj.nextInt();
        System.out.println("the perimeter is "+ (width+width+height+height) +" and the area is "+ width*height);
       
    }
    
}
