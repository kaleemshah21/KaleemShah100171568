/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 100171568
 */
public class Student {
    private String name;
    private int ID;
    private Course course;
    
    public Student(String name, int ID){
        this.name=name;
        this.ID=ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public void print(){
        System.out.println(this.name + "," + this.ID);
    }
}
