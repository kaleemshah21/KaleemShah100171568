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

    
    public static void main(String[] args) {
        //creates a new array list called songs which holds the Song objects
        List<Song> songs = new ArrayList<>();
        
        //regular expression for adding a song
        String REGEX = "^.*,[A-Za-z ]+,\\d+$";
        
        //added a few songs when the program is run initially to make it easier to test the code
        songs.add(new Song("I Wonder", "Kanye West", 491481155));
        songs.add(new Song("No Role Modelz", "J. Cole", 12345));
        songs.add(new Song("songname1", "artist1", 491481155));
        songs.add(new Song("songname2", "artist3", 12));
        
        //creates a scanner object to read inputs
        Scanner myObj = new Scanner(System.in);
        
        //sets a variable called choice to 7 which is just used as a place holder until the user inputs their choice
        int choice = 7;
        
        //creates a variable called menu which displays a menu on screen when printed
        String menu = "\n 1.)Add a new song \n 2.)Remove a song \n 3.)Print a list of all the songs stored \n 4.)print a list of songs over a certain number of plays \n 0.)Exit";
        
        //while loop to continuosly loop through the menu until a 0 is inputed as the choice
        while (choice!=0){
            
            //outputs the menu variable and asks the user to enter a choice
            System.out.println(menu + "\n" + "enter your choice (1 2 3, etc): ");
            
            //this tries to set choice to the user input but if its not a string it will catch the error and print an error message
            try{
                choice = myObj.nextInt();
            }
            catch(Exception e){
                System.out.println("error, invalid entry");
            }
            //consumes the newline character (not sure what this means but program doesnt wait for user input if not used)
            myObj.nextLine(); 
            
            //if the user enters 1 as the choice
            if (choice == 1){
                
                //this asks the user to enter the song details in the specific format
                System.out.println("enter the song in this format (song name,artist,plays)");
                String songDetails = myObj.nextLine();
                
                //this uses a module to set the REGEX variable which holds the regular expression for the user input, as the pattern
                Pattern pattern = Pattern.compile(REGEX);
                
                //this checks if the pattern matches the regular expression
                Matcher matcher = pattern.matcher(songDetails);
                
                //if the pattern doesnt match, an error message is outputted
                if (!matcher.matches()) {
                    System.out.println("invalid entry");
                }
                
                //if the pattern does match, it continues to split the input at the commas for each song detail
                else{
                    String[] songDetailsList = songDetails.split(",");
                    
                    //tries to set variables for each song detail, if for example the user enters a string for the plays variable which is an int->
                    //it will catch the error and display an error message
                    try{
                        String songName = songDetailsList[0].trim();
                        String songArtist = songDetailsList[1].trim();
                        int songPlays = Integer.parseInt(songDetailsList[2]);
                        
                        //this creates a new song object with the users input and adds it to the array list of songs
                        songs.add(new Song(songName, songArtist, songPlays));
                        System.out.println("success");
                    }
                    
                    //displays an error message if an error is caught
                    catch(Exception e){
                        System.out.println("Invalid Entry");
                    }

                }

            }
            
            //if the user enters 2 as the choice
            else if (choice == 2){
                
                //asks the user to enter the title of the song they want to remove
                System.out.println("Enter the title of the song you want to remove: ");
                
                //sets the song name to a variable called songTORemove
                String songTORemove = myObj.nextLine();
                
                //sets a boolean variable to false
                boolean songFound = false;
                
                //searches the songs array list to see if the song is there
                for (Song song:songs){
                    
                    //if the song is present, it will be removed from the array list
                    if (song.getTitle().equalsIgnoreCase(songTORemove)){
                        songs.remove(song);
                        songFound = true;
                        System.out.println("the song has been removed.");
                        break;
                    }
                }
                //if the song is not present in the array list then it will output a message saying so
                if (!songFound){
                    System.out.println("song not in the list.");
                }
            }
            
            //if the user enters 3 as the choice
            else if (choice == 3){
                
                //loops through the song array list
                // Print the updated list of songs to verify the title change
                for (Song song : songs) {
                    System.out.println("Title: " + song.getTitle());
                    System.out.println("Artist: " + song.getArtist());
                    System.out.println("Plays: " + song.getPlays());
                    System.out.println();
                }
            }
            
            //if the user enters 4 as the choice
            else if (choice == 4){
                
                //asks the user to enter the minimum number of plays
                System.out.println("enter the minimum number of plays you want to see: ");
                
                //tries to set a variable to the input
                try{
                    //if the input is not an integer, it will catch the error
                    int minNumberOfPlays = myObj.nextInt();
                    
                    //searches through the songs array list and if the song has plays above the min number, it will output it
                    for (Song song:songs){
                        if (song.getPlays() > minNumberOfPlays){
                            System.out.println("Title: " + song.getTitle());
                            System.out.println("Artist: " + song.getArtist());
                            System.out.println("Plays: " + song.getPlays());
                            System.out.println();
                        }
                        
                    }
                }
                
                //catches the error and outputs a message
                catch(Exception e){
                    System.out.println("Invalid Entry");
                }
                
            }
            
            //if the user enters 0 as the choice
            else if (choice == 0){
                
                //outputs Goodbye, the choice is now 0 so the while loop will end
                System.out.println("GoodBye");
            }
            
            //if the user enters anything other than 0,1,2,3,4
            else{
                //loop will just continue
                System.out.println("");
            }
        }
        
        
    }
    
}
