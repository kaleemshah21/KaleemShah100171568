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
    
    public Course(String name, String code){
        this.name = name;
        this.code = code;
        modules.add(new Module("Module1","MO1"));
        modules.add(new Module("Module2","MO2"));
        modules.add(new Module("Module3","MO4"));
        modules.add(new Module("Module4","MO4"));
        
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
