/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 100171568
 */
public class Course {
    private String name;
    private String code;
    
    public Course(){
        
    }
    
    public Course(String name, String code){
        this.name = name;
        this.code = code;
    }
    
   
    
    public void print(){
        System.out.println(this.name + "," + this.code);
    }
  
    public String getCourseName(){
        return this.name;
    }
    
    public String getCourseCode(){
        return this.code;
    }
}
