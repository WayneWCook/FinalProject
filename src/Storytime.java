/*Storytime.java
Alessandro Krapf, Luke Langius, and Safwan Ahmad
5.5.2020
java 160
This program runs a game. If you get it correct you move on until you beat the game, and if you get it wrong it restarts.
It uses classes hardchoices and thePlot.
 */
import java.util.Scanner;
public class Storytime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hardchoices x = new hardchoices();
        thePlot s = new thePlot();
        String choice;
        boolean loop  = false;
        System.out.println("What is your name?");
        s.name = input.nextLine();
        do{    //if the user loses, the program will restart from this point.
            for (int a=1; a<=13; a++) {   //for loop runs all of the story.
                s.storyX = a;   //decides which story to display by using the number of the for loop.
                System.out.println(s.Stories());    //displays story.
                if (s.storyX ==1) { choice = input.nextLine();
                    if (!choice.equals("Y")) System.out.println("It does not matter.");}
                else if (s.storyX ==2) s.politeVariable = input.nextLine();
                else if (s.storyX > 2 && s.storyX < 13) {
                    choice = input.nextLine();
                    x.loop2 = choice.equals(s.correct());   //makes boolean true if the user input is correct.
                    System.out.print(x.wrongchoice());   //if user input incorrect, displays text saying so.
                    if (x.restart()) {
                        loop = true;    //restarts program
                        break;                       //restarts program
                    }
                } else if (s.storyX == 13) {
                    loop = false;         //if the script finishes, the program ends itself.
                    break;
                }
            }
        } while (loop);
    }
}