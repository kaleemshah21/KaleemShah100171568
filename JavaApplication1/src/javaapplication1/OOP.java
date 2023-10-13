package javaapplication1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author shahk
 */
public class OOP {
    
    public void createDefaultSongs(Playlist myPlaylist){
        Song[] songs = new Song[10];//creates a new array called songs which holds the Song objects
        songs[0]= new Song("Electric Dreams at Midnight","Luna Aurora",72);
        songs[1]= new Song("Whispers in the Rain","Silver Harmony",45);
        songs[2]= new Song("Neon Sunshine","Dreamcatcher",89);
        songs[3]= new Song("Crystal Embrace","Midnight Mirage",12);
        songs[4]= new Song("Starry Serenade","Celestial Serenity",61);
        songs[5]= new Song("Velvet Skies","Phoenix Rising",34);
        songs[6]= new Song("Echoes of Tomorrow","Aurora Borealis",98);
        songs[7]= new Song("Lost in the Labyrinth of Love","Echo Enigma",27);
        songs[8]= new Song("Invisible Wings","Velvet Shadows",55);
        songs[9]= new Song("Enchanted Moonlight","Solar Flare Orchestra	",76);
        
        //searches through all songs in the songs list and adds them to the playlist arraylist
        for (Song song:songs){
            myPlaylist.addSong(song);
        }
        
}
 
    
    public static void main(String[] args) {
        Playlist myPlaylist=new Playlist();//creates a new object of the playlist class called myPlaylist
        OOP oop = new OOP(); // Create an object of the oop class
        oop.createDefaultSongs(myPlaylist); // Calls the method createDefaultSongs

        String REGEX = "^.*,[A-Za-z ]+,\\d+$";//regular expression for syntax of adding a song
        
        Scanner myObj = new Scanner(System.in);//creates a scanner object to read inputs
        
        int choice = 11; //sets a variable called choice to 11 which is just used as a place holder until the user inputs their choice
        
        //creates a variable called menu which displays a menu on screen when printed
        String menu = "\n 1.)Add a new song \n 2.)Remove a song \n 3.)Print a list of all the songs stored \n 4.)print a list of songs over a certain number of plays \n 5.)update a songs number of plays \n 6.)print all songs by a given artist \n 7.)print a random song \n 0.)Exit";
        
        //while loop to continuosly loop through the menu until a 0 is inputed as the choice
        while (choice!=0){
            
            System.out.println(menu + "\n" + "enter your choice (1 2 3, etc): ");//outputs the menu variable and asks the user to enter a choice
            
            try{ //this tries to set choice to the user input but if its not a string it will catch the error and print an error message
                choice = myObj.nextInt();
            }
            catch(Exception e){
                System.out.println("error, invalid entry");
            }  
            myObj.nextLine(); //consumes the newline character
            
            //if the user enters 1 as the choice
            if (choice == 1){
                System.out.println("enter the song in this format (song name,artist,plays)");//this asks the user to enter the song details in the specific format
                String songDetails = myObj.nextLine();//sets the variable to the users input
                
                Pattern pattern = Pattern.compile(REGEX);//this uses a module to set the REGEX variable which holds the regular expression for the user input, as the pattern
                Matcher matcher = pattern.matcher(songDetails);//this checks if the pattern matches the regular expression    
                if (!matcher.matches()) {//if the pattern doesnt match, an error message is outputted
                    System.out.println("invalid entry");
                }
                else{//otherwise, if the pattern does match, it continues to split the input at the commas for each song detail
                    String[] songDetailsList = songDetails.split(",");
        
                    try{//tries to set variables for each song detail, if for example the user enters a string for the plays variable which is an integer it will catch the error and display an error message
                        String songName = songDetailsList[0].trim();
                        String songArtist = songDetailsList[1].trim();
                        int songPlays = Integer.parseInt(songDetailsList[2]);
                        Song song1 = new Song(songName,songArtist,songPlays);//creates a Song object based on the users inputs which have been error checked
                        myPlaylist.addSong(song1);//adds the song to a playlist
                        System.out.println("successfully added");//outputs a success message to show that the object has been created
                    }
                    
                    catch(Exception e){//displays an error message if an error is caught
                        System.out.println("Invalid Entry");
                    }

                }

            }
            
            //if the user enters 2 as the choice
            else if (choice == 2){
                
                System.out.println("Enter the title of the song you want to remove: ");//asks the user to enter the title of the song they want to remove
                String songTORemove = myObj.nextLine();//sets the song name to a variable called songTORemove
                boolean Found = myPlaylist.removeSong(songTORemove);//calls the removeSong method in the Playlist class which searches through the arraylist and if found, removes the song and returns true
                if (!Found){//if the title doesnt match any song titles in the array list, false is returned and a suitable message is outputted
                    System.out.println("song not found");
                }
                else{//if the returned value isnt false then the song has been removed so a suitable message is outputted
                    System.out.println("song has been removed successfully");
                }

            }
            
            //if the user enters 3 as the choice
            else if (choice == 3){
                myPlaylist.printAll();//calls the printAll method in the Playlist class which loops through the arraylist and outputs all the songs present
            }
            
            //if the user enters 4 as the choice
            else if (choice == 4){
                System.out.println("enter the minimum number of plays you want to see: ");//asks the user to enter the minimum number of plays

                try{//tries to set a variable to the input, if the input is not an integer, it will catch the error
                    int minNumberOfPlays = myObj.nextInt();
                    boolean songsFound = myPlaylist.printAllAbovePlays(minNumberOfPlays);//calls the printAllAbovePlays method which takes the min number of plays entered and outputs all songs with higher plays
                    if (!songsFound){
                        System.out.println("no songs found by that artist");
                    }
                }
                
                catch(Exception e){//catches the error and outputs a message
                    System.out.println("Invalid Entry");
                }
                
            }
            
            //if the user enters 5 as the choice
            else if (choice == 5){
                
                System.out.println("Enter the title of the song you want to update: ");//prompts the user to enter the song title they would like to update the plays for
                String songTitleToFind = myObj.nextLine();//sets the variable to the users input
                try{//tries to set the input to an integer, if not an integer, it will catch the error
                    System.out.println("enter the new number of plays");//asks the user to enter the new number of plays
                    int updatedPlays = myObj.nextInt();//sets the user input to a variable
                    boolean success = myPlaylist.setSongPlays(songTitleToFind,updatedPlays);//sets a boolean variable to the returned value of the method setSongPlays
                    //the method setSongPlays searches through the arraylist to find a matching song title, if found it will return true, otherwise it will return false
                    if (!success){//if returned false, a message saying the song isnt found will be outputted
                        System.out.println("song not found");
                    }
                    else{//otherwise, it will output a success message
                        System.out.println("song successfully updated");
                    }
                    
                }
                catch(Exception e){//catches the input error and displays an error message
                    System.out.println("not a valid number");
                }
                       
            }
            
            //if the user enters 6 as the choice
            else if (choice == 6){
                System.out.println("enter the name of the artist whos songs you would like to see: ");//prompts the user to enter the chosen artist
                String artistToFind = myObj.nextLine();//sets the input to a variable
                myPlaylist.findByArtist(artistToFind);//calls the findByArtist method which takes the user input and searches the arraylist to find all songs by the entered artist
            }
            
            //if the user enters 7 as the choice
            else if (choice == 7){
                myPlaylist.getRandomSong();//calls the method getRandomSong which outputs a random song within the playlist
            }
            //if the user enters 0 as the choice
            else if (choice == 0){
                
                //outputs Goodbye, the choice is now 0 so the while loop will end
                System.out.println("GoodBye");
            }
            
            //if the user enters anything other than 0,1,2,3,4,5,6,7
            else{
                //loop will just continue
                System.out.println("");
            }
        }
        
        
    }
    
}
