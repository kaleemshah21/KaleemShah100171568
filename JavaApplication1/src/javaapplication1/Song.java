package javaapplication1;

/**
 *
 * @author shahk
 */

//creates a Song class with three attributes of title, artist and plays
public class Song {
    private String title;
    private String artist;
    private int plays;
    
//creates a constructor which is empty so a blank object can be made
    public Song(){
        
    }
    
//creates a constructor which takes 3 inputs to set the title, artist and plays
    public Song(String Title,String Artist,int Plays){
        this.title=Title;
        this.artist=Artist;
        this.plays=Plays;
        
    }

    //getter method to return the title when called
    public String getTitle(){
        return this.title;
    }
    
    //getter method to return the artist when called
    public String getArtist(){
        return this.artist;
    }
    
    //getter method to return the plays when called
    public int getPlays(){
        return this.plays;
    }
    
    //setter method to set the title to the inputed string
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    
    //setter method to set the artist to the inputed string
    public void setArtist(String newArtist){
        this.artist = newArtist;
    }
    
    //setter method to set the number of plays to the inputted integer
    public void setPlays(int newPlays){
        this.plays = newPlays;
    }
    
    //prints the current objects title, artist and plays
    public void print(){
        System.out.println(this.title + "," + this.artist + "," + this.plays);
    }
    
//    // Static method to print all songs in a list
//    public static void printAllSongs(List<Song> songs) {
//        for (Song song : songs) {
//            System.out.println("Title: " + song.getTitle());
//            System.out.println("Artist: " + song.getArtist());
//            System.out.println("Plays: " + song.getPlays());
//            System.out.println();
//        }
//    }
    
    
}
