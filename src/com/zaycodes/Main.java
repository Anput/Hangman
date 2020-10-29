package com.zaycodes;
import java.util.*;
public class Main {

        static Scanner input;
        static String name;
        int guessCount;
        int correctGuesses;
        static String toPlay;
        String guessWord;
        String[] hangMan = new String[]{"Head", "Body", "L.Arm", "R.Arm", "L.Leg", "R.Leg"};
        String [] guessWords = new String[]{"blackjack","mezzanine","unpuzzles","equalized", "jacquards","kickboxer","highjinks","oxidizing","applejack", "checkbook"};

    public static void main(String[] args) {
        // write your code here
                System.out.println("Hi! Welcome to hangman!");
                System.out.println("What is your name?");
                name = input.next();
                System.out.println("Would you like to play a game?");

                toPlay = input.next();
                if (toPlay != "Y" || toPlay!= "y" || toPlay!= "N" || toPlay!= "n") {
                    System.out.println("That's not an option! Try again");

                } else if (toPlay == "Y" || toPlay == "y"){
                    System.out.println("Ok, " + name + ". Will you save a life today?");
                } else if (toPlay == "N" || toPlay == "n"){
                    System.exit(0);
                }



                //Create "menu"
                //begin the game

                //Hava a word chosen via input
                //Store string in an array

                //loop begins(?)
                //Have player guess a char
                //run char through array

                //if char correct code

                //if char incorrect code

                //Give
                //new comment


        }


    }


