/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import java.util.Random;
import java.util.Scanner;
/**
 * @author levin.o646
 */
public class GuessingGame {
    public static void main(String[] args) {
        int secret;
        final int MIN = 1;
        final int MAX = 10;
        
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String prompt = "I'm thinking of a number between " + MIN + " and " + MAX
            + ". Guess: ";
        
        //nextInt(#possibilities) + smallest_possibility
        secret = rnd.nextInt(MAX - MIN + 1) + MIN;
        
        System.out.print(prompt);
        int guess = in.nextInt();
        
        if(guess == secret) {
            System.out.print("You're right");
        } else {
            System.out.println("Wrong");
        }
        System.out.println(". It was " + secret);
    } 
}
