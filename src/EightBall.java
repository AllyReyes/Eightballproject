package com.company;

import java.util.Scanner;

public class EightBall {
    public static void main(String[] args) {

//      public static void printNumbers() {
        Scanner input = new Scanner(System.in);


        System.out.println("Hello there! What's your name?");
        String name = input.nextLine();
        System.out.printf("Hello %s ! Would you like to play a game? Y or N\n", name);
        String playAGame = input.nextLine();
      if (playAGame.equals("Y")) {
          System.out.println("Lets play!\n");
      } if (playAGame.equals("N")) {
          System.exit(0);
        }
        System.out.println("Do you have a red car?");
      String car = input.nextLine();
        System.out.println("What is the name of your favorite pet?\n");
        String petName = input.nextLine();
        System.out.printf("How old is %s?\n", petName);
        int petAge = input.nextInt();
        System.out.println("What is your lucky number?\n");
        int luckyNum = input.nextInt();
        System.out.println("Do you have a favorite quarter back? If so what is their jersey number?\n");
        int jerseyNum = input.nextInt();
        System.out.println("What is the two digit model year for your car?\n");
        int modelNum = input.nextInt();




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
//        }
//        public static void printLowerCase () {
//
//        }
//
//        public static void printUpperCase () {
//
        }
    }


