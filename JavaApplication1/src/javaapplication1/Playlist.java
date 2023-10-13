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
public class Playlist {
    private ArrayList<Song> playlist;
    
    
    
    public Playlist(){
        this.playlist=new ArrayList<>();
    }
    
    public void addSong(Song song){
        this.playlist.add(song);
    }
    
    
    public int getLength(){
        return this.playlist.size();
        
    }
    
    public void clearPlaylist(){
        this.playlist.clear();
    }
    
    
    
    
    public void printAll(){
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            System.out.println(current.getTitle());
            System.out.println(current.getArtist());
            System.out.println(current.getPlays());
            System.out.println("\n");
        }
    }
    
    public boolean removeSong(String songTitle){
        boolean songFound = false;
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            if (current.getTitle().equals(songTitle)){
                playlist.remove(index);
                songFound = true;
            
            }
        }
        return songFound;
    }
    
    public void printAllAbovePlays(int songPlays){
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            if (current.getPlays()>songPlays){
                current.print();
            }
        }
    }
    
    
    
    
}
