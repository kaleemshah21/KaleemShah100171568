/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author shahk
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song myObj = new Song("I Wonder", "Kanye West", 491481155);
        System.out.println(myObj.getTitle() + ", " + myObj.getArtist() + ", " +  myObj.getPlays());
        myObj.setArtist("Kendrick Lamar"); //here i changed the artist to kendrick lamar and then printed the getArtist method which shows it has been changed
        System.out.println(myObj.getArtist());
    }
    
}
