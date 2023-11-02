/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kaleem Shah @version 1.18
 */
public class Playlist {//creates a Playlist class with an arraylist called playlist as an attribute
    private ArrayList<Song> playlist;
    
    
    
    public Playlist(){//constructor, creates a new arraylist
        this.playlist=new ArrayList<>();
    }
    
    public void addSong(Song song){//takes the song object passed through and adds it to the playlist array list
        this.playlist.add(song);
    }
    
    
    public int getLength(){//gets the number of items/size of the arraylist
        return this.playlist.size();
        
    }
    
    public void clearPlaylist(){//clears the playlist
        this.playlist.clear();
    }
    
    
    
    
    public void printAll(){//searches through each Song object in the playlist and prints them
        for (int index=0;index < playlist.size();index++){
            Song current=playlist.get(index);
            current.print();
        }
    }
    
    /*takes the song title entered by the user and if the song is in the playlist, it 
    removes it and returns true, if not in the playlist it returns false*/
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
    
    /*searches for the song in the playlist, if found,
    it updates the plays and returns true, if not found, returns false*/
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
    
    /*searches for all songs in the playlist that have the plays value higher than 
    the value the user entered, if there are songs that match this, then it calls 
    the method to print it and returns true, if none match, returns false.*/
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
    
    /*searches the playlist for all songs by an entered artist and prints them, if none found, it outputs a message.*/
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
    
    public void getRandomSong(){//sets a random integer from 0 to the size of the playlist, then prints the song which has that index
        Random rand = new Random();
        int n = rand.nextInt(this.playlist.size());
        Song randomSong = this.playlist.get(n);
        randomSong.print();
    }
    
    
    
    
}
