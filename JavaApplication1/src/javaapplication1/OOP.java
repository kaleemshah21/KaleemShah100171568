/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.List;
import helpers.*;
import java.util.Scanner;

/**
 *
 * @author shahk
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        //songs.add(new Song("I Wonder", "Kanye West", 491481155));
        //songs.add(new Song("No Role Modelz", "J. Cole", 12345));
        
        Scanner myObj = new Scanner(System.in);
        int choice = 3;
        String menu = "\n 1.)Add a new song \n 2.)Remove a song \n 3.)Print a list of all the songs stored \n 4.)print a list of songs over a certain number of plays \n 0.) Exit";
        
        while (choice!=0){
            System.out.println(menu + "\n" + "enter your choice (1 2 3, etc): ");
            choice = myObj.nextInt();
            myObj.nextLine(); //consumes the newline character (not sure what this means but program doesnt wait for user input if not used)
            
            
            if (choice == 1){
                //this block of code just gets the users input, parses it and splits it into variables
                System.out.println("enter the song in this format (song name,artist,plays");
                String songDetails = myObj.nextLine();
                String[] songDetailsList = songDetails.split(",");
                String songName = songDetailsList[0].trim();
                String songArtist = songDetailsList[1].trim();
                int songPlays = Integer.parseInt(songDetailsList[2]);
                
                //this creates a new song object with the users input and adds it to the array list of songs
                songs.add(new Song(songName, songArtist, songPlays));
                
                
                
                
            }
            else if (choice == 2){
                System.out.println("Enter the title of the song you want to remove: ");
                String songTORemove = myObj.nextLine();
                boolean songFound = false;
                
                for (Song song:songs){
                    if (song.getTitle().equalsIgnoreCase(songTORemove)){
                        songs.remove(song);
                        songFound = true;
                        System.out.println("the song has been removed.");
                        break;
                    }
                }
                if (!songFound){
                    System.out.println("song not in the list.");
                }
            }
            else if (choice == 3){
                
                // Print the updated list of songs to verify the title change
                for (Song song : songs) {
                    System.out.println("Title: " + song.getTitle());
                    System.out.println("Artist: " + song.getArtist());
                    System.out.println("Plays: " + song.getPlays());
                    System.out.println();
                }
            }
            else if (choice == 4){
                System.out.println("u typed 4");
            }
            else if (choice == 0){
                System.out.println("u typed 0 so the program will quit");
            }
            else{
                System.out.println("invalid entry");
            }
        }
        
        
        
        //Song myObj = new Song("I Wonder", "Kanye West", 491481155);
        //System.out.println(myObj.getTitle() + ", " + myObj.getArtist() + ", " +  myObj.getPlays());
        //myObj.setArtist("Kendrick Lamar"); //here i changed the artist to kendrick lamar and then printed the getArtist method which shows it has been changed
        //System.out.println(myObj.getArtist());
        
        
//        // Specify the title of the song you want to update
//        String targetTitle = "I Wonder";
//
//        // Specify the new title you want to set
//        String newTitle = "New Song Title";
//
//        // Search for the specific song by title and update its title
//        for (Song song : songs) {
//            if (song.getTitle().equals(targetTitle)) {
//                // Found the song with the specified title
//                song.setTitle(newTitle); // Update the title
//                break; // Exit the loop since we found the song
//            }
//        }
//
//        // Print the updated list of songs to verify the title change
//        for (Song song : songs) {
//            System.out.println("Title: " + song.getTitle());
//            System.out.println("Artist: " + song.getArtist());
//            System.out.println("Plays: " + song.getPlays());
//            System.out.println();
//        }
    }
    
}
