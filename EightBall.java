package com.company;

import java.util.Scanner;


public class EightBall {
//    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, World!");
*/

    public static void printNumbers() {
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello there! What's your name?");
        String name = input.nextLine();
        System.out.printf("Hello %s ! Would you like to play a game?\n Y or N", name);
        if (input = Y){
            System.out.println("Great! I need to ask you some more questions then.");
        } if (input = N) {
            System.exit(0);
        }

//
//        int Num = 0;
//        do {
//            System.out.print("Please pick a number 1- 10: ");
//            while (!input.hasNextInt()) {
//                while (Num > 11) ;
//                String number = input.next();
//                System.out.printf("This number is not 10 or under- please try again.\n", input);
//            }
//            Num = input.nextInt();
//        } while (Num < 10);
//        System.out.printf("Thank you! That number is great %d.\n", Num);
//    }
    }
    public static void printLowerCase() {

    }

    public static void printUpperCase() {

    }
}
