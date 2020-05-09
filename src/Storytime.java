/*Storytime.java
 *Luke Langius, Alessandro Krapf, and Safwan Ahmad
 * 5/8/2020
 * Java 160
 * This program runs a game. If you get it correct you move on until you beat the game, and if you get it wrong it restarts. It uses classes hardchoices and thePlot.
 */
import java.util.Scanner;
public class Storytime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hardchoices x = new hardchoices();
        thePlot s = new thePlot();
        int userChoice = 0;
        boolean loop  = false;
        boolean tryCatch = false;
        System.out.println("What is your name?");
        s.name = input.nextLine();
        do{    //if the user loses, the program will restart from this point.
            lable1:           //The code uses "lable1" later to break out of a multiple loops at once
            for (int a=1; a<=13; a++) {   //for loop runs all of the story.
                s.storyX = a;   //decides which story to display by using the number of the for loop.
                System.out.println(s.Stories());    //displays story.
                do {
                    try {                     //start of try catch
                        if (s.storyX == 1) {                                                                       //doing the try catch for the first part of the story
                            userChoice = input.nextInt();
                            if (userChoice < 1 || userChoice > 2) {
                                throw new ArithmeticException("Please type in either 1 or 2: ");                 //throwing an exception if the user doesn't enter 1 or 2
                            }
                            tryCatch = false;
                        }
                    } catch (Exception e) {
                        System.out.println("Please type in either 1 or 2: ");                       //catching another exception if the user doesn't enter 1 or 2, and asks them to enter 1 or 2
                        input.nextLine();
                        tryCatch = true;
                    }
                } while (tryCatch);                         //end of try and catch
                if (s.storyX == 1) { if (userChoice != 1) {System.out.println("That's unfortunate for you, you don't have a choice");}}         //this makes it so no matter what you choose for the first part, you will always go through into the next room
                do {
                    try {
                        if (s.storyX == 2) {                        //try catch for the second part of the story
                            userChoice = input.nextInt();
                            if (userChoice == 3) {s.politeVariable = userChoice;}            //there is an option for the 3rd part to use your name, so if the user chooses 3, there name will be saved as "politeVariable"
                            if (userChoice < 1 || userChoice > 3) {
                                throw new ArithmeticException("Please type in a number 1 - 3: ");       //throwing the exception
                            }
                            tryCatch = false;
                        }
                    } catch (Exception e) {
                        System.out.println("Please type in a number 1 - 3: ");                   //catching the exception and asking the user to type in a number from 1 - 3
                        input.nextLine();
                        tryCatch = true;
                    }
                } while (tryCatch);                      //end of try and catch
                do {
                    try {
                        if (s.storyX > 2 && s.storyX < 13) {                  //doing the try catch for the rest of the story (parts 3 - 12)
                            userChoice = input.nextInt();
                            if (userChoice < 1 || userChoice > 3) {
                                throw new ArithmeticException("Please type in a number 1 - 3: ");       //throws exception if the user don't enter a number in the right parameters, or the user enters anything besides a number
                            }
                            x.loop2 = userChoice == (s.correct());                                 //checking if the user entered the correct answer
                            if (x.incorrect().equals(x.wrongChoice)) {
                                loop = true;                               //if the user entered the incorrect answer, they would be reset back to the very beginning of the game.
                                break lable1;               //since this if statement is inside of a do while loop and a for loop, I set a lable1 before the for loop so that if the user enters the incorrect answer it would break out of both of the loops and restart the game
                            } else if (s.storyX == 13) {
                                loop = false;                         //if the user got all of the correct answer it will break them out of the do while loop and allow them to win the game
                                break lable1;
                            }
                            tryCatch = false;
                        }
                    } catch (Exception e) {
                        System.out.println("Please type in a number 1 - 3: ");         //catching the thrown exception
                        input.nextLine();
                        tryCatch = true;
                    }
                } while (tryCatch);                  //end of try and catch
            }
        } while (loop);
    }
}