/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.Random;

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
            current.print();
        }
    }
    
    public boolean removeSong(String songTitle){
        boolean songFound = false;
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            if (current.getTitle().equalsIgnoreCase(songTitle)){
                playlist.remove(index);
                songFound = true;
            
            }
        }
        return songFound;
    }
    
    public boolean setSongPlays(String songTitle,int songPlays ){
        boolean songFound = false;
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            if (current.getTitle().equalsIgnoreCase(songTitle)){
                current.setPlays(songPlays);
                songFound = true;
            
            }
        }
        return songFound;
    }
    
    public boolean printAllAbovePlays(int songPlays){
        boolean songsFound = false;
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            if (current.getPlays()>songPlays){
                current.print();
                songsFound = true;
            }
        }
        return songsFound;
    }
    
    public void findByArtist(String songArtist){
        boolean artistFound = false;
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            if (current.getArtist().equalsIgnoreCase(songArtist)){
                current.print();
                artistFound = true;
                
                
            }
        }
        if (!artistFound){
            System.out.println("no songs by this artist");
        }
    }
    
    public void getRandomSong(){
        Random rand = new Random();
        int n = rand.nextInt(this.playlist.size());
        Song randomSong = this.playlist.get(n);
        randomSong.print();
    }
    
    
    
    
}
