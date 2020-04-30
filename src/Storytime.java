import java.util.Scanner;

public class Storytime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, choice, choice0, choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8, choice9, choice10;
        boolean loop = true;
        do {
            System.out.println("What is your name?");
            name = input.nextLine();
            System.out.println("Your character rides in on a horse into an abandoned ghost town. You step into a building to check for supplies. \nYou look in and around the abandoned saloon. You see a dark room.\n" +
                    "Do you want to continue to the room(Y/N)?\n");
            choice = input.nextLine();
            if (choice.equals("Y")) {
                System.out.println("You continue to the room. You hear a large rumbling surrounding the room. A large green light is going in the walls. \nYou hear a loud voice coming from the walls. A green ball comes from the wall like an egg. It hatches and there it stands a large half rotting corpse standing in front of you. \n" +
                        "\"Hello there, now whats your name.\"\n" +
                        "Choices:\n" +
                        "1. I don’t have to answer that\n" +
                        "2.Rude gesture\n" +
                        "3.Your character name\n" +
                        "\"Well, " + name + ", no matter what you do, you ain’t leaving this place alive. And when you get to hell tell ‘em Johnny Trainwreck sent you!”\n" +
                        "*YOU ARE ENTERING THE FIGHT PHASE*\n" +
                        "Johnny Trainwreck’s first attack will be a train throw.\n" +
                        "You will have to pick the correct answer from 3 letters from choices.\n" +
                        "A.Dodge the train and fire\n" +
                        "B. Try to pass through the train and fire\n" +
                        "C. Lay down and die");
                choice0 = input.nextLine();
                if (choice0.equals("A")) {
                    System.out.println("\"ARRRRRRRRGH, well you got lucky.See if you can handle this next attack.\"\n" +
                            "Next attack is a giant rail spike rain which follows you.\n" +
                            "A. Run and dodge the spikes which follow you a futile task\n" +
                            "B. Take a spike while guarding most of your body, then fire\n" +
                            "C. Lay down and die");
                    choice1 = input.nextLine();
                    if (choice1.equals("B")) {
                        System.out.println("\"That seems weirdly lucky, like something is helping you.\"" +
                                "The final attack is a giant railway maze attack.\n" +
                                "A.Let the railway pierce you with everything\n" +
                                "B. Lay down and die\n" +
                                "   C.Hide behind a table and then shoot him");
                        choice2 = input.nextLine();
                        if (choice2.equals("C")) {
                            System.out.println("\"ARRRRRRGGHH!\" and Johnny falls over, and dies.\n" +
                                    "Y ou will then look around and move to the next room\n" +
                                    "Then you will hear two cackling voices,and two more green balls will come from the wall.\n" +
                                    "“We are the TWINS,yes that is what our mother named us. Don’t judge\uD83D\uDE1D\n" +
                                    "First attack will be two hammers attacking you at once.\n" +
                                    "A. Lay down and die\n" +
                                    "B. Take one in the face and shoot them both\n" +
                                    "C. Try and dodge");
                            choice3 = input.nextLine();
                            if (choice3.equals("B")) {
                                System.out.println("\"UGH, your a harder kill than we thought.\"" +
                                        "Two whips are being whipped at you.\n" +
                                        "A.  Take a whipping like the loser you are\n" +
                                        "B.  Catch both whips and shoot both\n" +
                                        "C.  Lay down and die"); 
                                choice4 = input.nextLine();
                                if (choice4.equals("B")) {
                                    System.out.println("Their final attack will be high pitched screaming.\n" +
                                            "A. SHUT UP AND KILL THEM BOTH\n" +
                                            "B.  Run away and never look back\n" +
                                            "C. Lay down and die while your head hurts\n");
                                    choice5 = input.nextLine();
                                    if (choice5.equals("A")) {
                                        System.out.println("The Twins explode and they slink back to whatever place they need to be.\n" +
                                                "You hear a dark rumbling and a man  in western dark garb approaches. You hear him whisper something you can't understand. Then silence.\n" +
                                                "You realize that this \"man\", is not a man. He is 10 feet tall,  and you understand nothing. Even your own thoughts are turning to gibberish.\n" +
                                                "Your sight is becoming blurred. This Thing is in your head. The last thing you realize is that you will have to guess what you want to do, since you don't know what you will be doing anymore.\n" +
                                                "@$#%^YTVCJFDRT\n" +
                                                "A. Ymg''ll ah'mglw'nafh\n" +
                                                "B.      Ymg''ll ah'mglw'nafh\n" +
                                                "C. Ymg''ll ah'mglw'nafh");
                                        choice6 = input.nextLine();
                                        if (choice6.equals("B")) {
                                            System.out.println("2.@#$%^&*(&^%$##&*&*\n" +
                                                    "A. Ahh ymg' ah mgephai geb\n" +
                                                    "B. Ahh ymg' ah mgephai geb\n" +
                                                    "C. Ahh ymg' ah mgephai geb\n");
                                            choice7 = input.nextLine();
                                            if (choice7.equals("A")) {
                                                System.out.println("3.$%^&UYGTFYR$^%&^&*(\n" +
                                                        "A. Zhro ya\n" +
                                                        "B. Zhro ya\n" +
                                                        "C. Zhro ya");
                                                choice8 = input.nextLine();
                                                if (choice8.equals("C")) {
                                                    System.out.println(" 4.$%^&*(UIYUGTFR^$\n" +
                                                            "A. Fahf ah weird nafl l' bug ah'legeth\n" +
                                                            "B. Fahf ah weird nafl l' bug ah'legeth\n" +
                                                            "C. Fahf ah weird nafl l' bug ah'legeth");
                                                    choice9 = input.nextLine();
                                                    System.out.println("You see black everywhere, yet you somehow see the black being evaporate. Then nothing.\n" +
                                                            "");
                                                    if (choice9.equals("A") || choice9.equals("B") || choice9.equals("C")) {
                                                        System.out.println("You don't feel anything. However, you hear a voice talking to you:\n" +
                                                                "\"Hello. You died. I have existed forever. You will now think forever.\n" +
                                                                "I had put you in a loop, to attempt to kill me. I was that Thing, as you had called me.\n" +
                                                                "The loop was supposed to be impossible to complete, yet you completed it.\n" +
                                                                "Congratulations. For your feat, I have ended the loop. I will allow you to experience death now.");
                                                        loop = false;
                                                    } else
                                                        System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                                                } else
                                                    System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                                            } else
                                                System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                                        } else
                                            System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                                    } else
                                        System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                                } else
                                    System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                            } else
                                System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                        } else
                            System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                    } else
                        System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
                } else
                    System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
            } else
                System.out.println("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.");
        } while (loop);
    }
}