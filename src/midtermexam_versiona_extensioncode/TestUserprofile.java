/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Juan Alvarez
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digit your name");
        String name = input.nextLine();
        
        System.out.println("Available genres:");
        for (int i = 0; i < UserProfile.genres.length; i++) {
            System.out.println((i + 1) + ". " + UserProfile.genres[i]);
        }
        String givenGenre = input.nextLine();
        
        
        UserProfile user = new UserProfile(name, givenGenre);
        
        System.out.println("Your user has been created. this is your info =\nName " + user.getUserID() + " \nFavorite Genre " + user.getGenre());
        
    }
}
