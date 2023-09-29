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
public class W2Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int grade_NS = 0;
        final int grade_F = 39;
        final int grade_D = 49;
        final int grade_C = 59;
        final int grade_B = 69;
        final int grade_A = 100;
        Scanner myObj = new Scanner(System.in); 
        System.out.println("enter the exam mark(0-100)");
        int examMark = myObj.nextInt();
        if(examMark >= grade_NS && examMark< grade_F){
            System.out.println("your have failed");
          
        }else if(examMark >= grade_F && examMark < grade_D){
            System.out.println("you got an F");
        }else if(examMark >= grade_D && examMark < grade_C){
            System.out.println("you got a D");
        }else if(examMark >= grade_C && examMark < grade_B){
            System.out.println("you got a C");
        }else if(examMark >= grade_B && examMark < grade_A){
            System.out.println("you got a B");
        }else if(examMark >= grade_B && examMark < grade_A){
            System.out.println("you got an A");
        }else{
            System.out.println("you have an invalid mark");
        }
        
        
    }
    
}
