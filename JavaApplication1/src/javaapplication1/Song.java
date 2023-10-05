/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author shahk
 */
public class Song {
    private String title;
    private String artist;
    private int plays;
    
    /*constructor
    
    
    */
    public Song(String Title,String Artist,int Plays){
        this.title=Title;
        this.artist=Artist;
        this.plays=Plays;
        
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public int getPlays(){
        return this.plays;
    }
    
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    
    public void setArtist(String newArtist){
        this.artist = newArtist;
    }
    
    public void setPlays(int newPlays){
        this.plays = newPlays;
    }
    
    
    
    
    
    
    
    
    
    
}
