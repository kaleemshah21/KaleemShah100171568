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
public class W2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String uniGrade = "";
       Scanner myObj = new Scanner(System.in); 
       System.out.println("enter your grade");
       String grade = myObj.nextLine();
       if (grade.equals("A")){
           uniGrade += "1st";
       }
       else if (grade.equals("B")){
           uniGrade += "2:1";
       }
       else if (grade.equals("C")){
           uniGrade += "2:2";
       }
       else if (grade.equals("D")){
           uniGrade += "3rd";
       }
       else if (grade.equals("E")){
           uniGrade += "ordinary";
       }
       else if (grade.equals("F")){
           uniGrade += "fail";
       }
       
       System.out.println("your grade is "+ uniGrade);
    }
    
}
