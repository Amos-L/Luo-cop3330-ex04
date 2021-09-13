/*
 *  UCF COP3330 Fall 2021 Assignment 1.4 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter a noun: "); //Asking for user input
        String noun = x.nextLine(); //Storing user input to string quote

        Scanner y = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String verb = x.nextLine(); //Storing user input to string quote

        Scanner z = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adj = x.nextLine(); //Storing user input to string quote

        Scanner a = new Scanner(System.in);
        System.out.print("Enter an adverb: ");
        String adv = x.nextLine(); //Storing user input to string quote

        System.out.printf("Do you %s your %s %s %s? That's hilarious!\n", verb, adj,noun,adv); //Printing

    }
}