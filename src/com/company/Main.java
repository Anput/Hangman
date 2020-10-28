package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int Guesses = 0;
        int correctGuesses = 0;
        System.out.println("Welcome to Hangman: enter your name");
        String playerName = sc.next();
        System.out.println("Thank you " + playerName + ", please review the rules of the game below"
                + "\nAll mystery words have 9 letters"
                + "\nYou get 6 guesses ");
    }
}
