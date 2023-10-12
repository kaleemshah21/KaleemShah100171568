/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author 100171568
 */
public class Course {
    private String name;
    private String code;
    private ArrayList<Module> modules;
    
    
    public Course(){
        
    }
    
    public Course(String name, String code, String module_1,String module_2, String module_3, String module_4){
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
