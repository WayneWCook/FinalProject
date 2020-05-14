/*Storytime.java
 *Luke Langius, Alessandro Krapf, and Safwan Ahmad
 * 5/13/2020
 * CECFC/FRCC Java 160
 * This program runs a game. If you get it correct you move on until you beat the game, and if you get it wrong it restarts. It uses classes hardchoices and thePlot.
 */
import java.util.Scanner;
public class StoryTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IncorrectAnswer i = new IncorrectAnswer();                       //getting the stuff from the other classes
        CorrectAnswer c = new CorrectAnswer();
        ThePlot p = new ThePlot();
        int userChoice = 0;
        int maxStory=13;   //xy is number of steps >2
        boolean loop;
        boolean tryCatch = false;
        System.out.println("What is your name?");
        p.name = input.nextLine();
        do{    //if the user loses, the program will restart from this point.
            loop = false;
            lable1:           //The code uses "lable1" later to break out of a multiple loops at once
            for (int a=1; a<=maxStory; a++) {   //for loop runs all of the story.
                p.storyNum = a;   //decides which story to display by using the number of the for loop.
                c.storyNum = a;   //Has to be defined for both ThePlot and CorrectAnswer. If not does not work.
                System.out.println(p.Stories());    //displays story.
                do {
                    try {                     //start of try catch
                        if (c.storyNum == 1) {                                                                       //doing the try catch for the first part of the story
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
                if (c.storyNum == 1) { if (userChoice != 1) {System.out.println("That's unfortunate for you, you don't have a choice");}}         //this makes it so no matter what you choose for the first part, you will always go through into the next room
                do {
                    try {
                        if (c.storyNum == 2) {                        //try catch for the second part of the story
                            userChoice = input.nextInt();
                            p.politeVariable = userChoice;            //there is an option for the 3rd part to use your name, so if the user chooses 3, there name will be saved as "politeVariable"
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
                        if (c.storyNum > 2 && c.storyNum < maxStory) {                  //doing the try catch for the rest of the story (parts 3 - 12)
                            userChoice = input.nextInt();
                            if (userChoice < 1 || userChoice > 3) {
                                throw new ArithmeticException("Please type in a number 1 - 3: ");       //throws exception if the user don't enter a number in the right parameters, or the user enters anything besides a number
                            }
                            i.rightOrWrong = c.correct(userChoice);                                 //checking if the user entered the correct answer
                            System.out.print(i.incorrect());
                            if (!i.rightOrWrong) {
                                loop = true;                               //if the user entered the incorrect answer, they would be reset back to the very beginning of the game.
                                break lable1;               //since this if statement is inside of a do while loop and a for loop, I set a lable1 before the for loop so that if the user enters the incorrect answer it would break out of both of the loops and restart the game
                            } else if (c.storyNum == maxStory) {
                                tryCatch=false; //if the user got all of the correct answer it will break them out of the do while loop and allow them to win the game
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