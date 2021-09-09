/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner nounScan = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = nounScan.nextLine();

        Scanner verbScan = new Scanner(System.in);
        System.out.println("Enter a verb: ");
        String verb = verbScan.nextLine();

        Scanner adjScan = new Scanner(System.in);
        System.out.println("Enter an adjective: ");
        String adj = adjScan.nextLine();

        Scanner advScan = new Scanner(System.in);
        System.out.println("Enter an adverb");
        String adv = advScan.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious.");

        nounScan.close();
        verbScan.close();
        adjScan.close();
        advScan.close();
    }
}
