/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 100171568
 */
public class W3Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student myObj = new Student("Kaleem Shah",100171568);
        System.out.println(myObj.getName() + "," + myObj.getID());
        myObj.print();
        
        Course computing = new Course ("Computing","CO456");
        computing.print();
        
        Course myObj2 = new Course();
        
    }
    
}
