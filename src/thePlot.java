/*thePlot.java
 *Safwan Ahmad, Alessandro Krapf, and Luke Langius
 * 5/8/2020
 * Java 160
 * This program displays all of the story. It also defines the right choices for each option of the game. It works for the main class.
 */
public class thePlot {
    public int storyX;
    public String name;
    public int politeVariable;
    public String Polite() {    //If in Story part 2 the user decides to give name, then will display name in Part 3.
        String Polite;
        if (politeVariable == 3) Polite = name;
        else Polite = "no matter who you are"; // if user decides not to give name, it will just display "no matter who you are"
        return Polite;
    }
    public String Stories() {           //Is story. Will print the story in correct order because of for loop in main.
        if (storyX == 1) return "Your character rides in on a horse into an abandoned ghost town. You step into a building to check for supplies. " +
                "\nYou look in and around the abandoned saloon. You see a dark room.\n" +
                "Do you want to continue to the room?\n" +
                "1. Yes\n" +
                "2. No\n" +
                "Choice: ";
        else if (storyX == 2) return "You continue to the room. You hear a large rumbling surrounding the room. A large green light is going in the walls. " +
                "\nYou hear a loud voice coming from the walls. A green ball comes from the wall like an egg. \nIt hatches and there it stands a large half rotting corpse standing in front of you. \n" +
                "\"Hello there, now whats your name?\"\n" +
                "Choices:\n" +
                "1. I don’t have to answer that\n" +
                "2. Rude gesture\n" +
                "3. Your character name";
        else if (storyX == 3) return "Well, " + Polite() + ", you ain’t leaving this place alive. And when you get to hell tell ‘em Johnny Trainwreck sent you!”\n" +
                "Johnny Trainwreck’s first attack will be a train throw.\n" +
                "You will have to pick the correct answer from 3 numbers as your choices. Use only numbers.\n" +
                "1. Dodge the train and fire\n" +
                "2. Try to pass through the train and fire\n" +
                "3. Lay down and die";
        else if (storyX == 4) return "\"ARGH, well you got lucky. See if you can handle this next attack.\"\n" +
                "Next attack is a giant rail spike rain which follows you.\n" +
                "1. Run and dodge the spikes which follow, you a futile task\n" +
                "2. Take a spike while guarding most of your body, then fire\n" +
                "3. Lay down and die";
        else if (storyX == 5) return "\"That seems weirdly lucky, like something is helping you.\"\n" +
                "The final attack is a giant railway maze attack.\n" +
                "1. Let the railway pierce you with everything\n" +
                "2. Lay down and die\n" +
                "3. Hide behind a table and then shoot him";
        else if (storyX == 6) return "\"ARRRRRRGGHH!\" and Johnny falls over, and dies.\n" +
                "You will then look around and move to the next room\n" +
                "Then you will hear two cackling voices,and two more green balls will come from the wall.\n" +
                "“We are the TWINS, yes that is what our mother named us. Don’t judge\uD83D\uDE1D\n" +
                "First attack will be two hammers attacking you at once.\n" +
                "1. Lay down and die\n" +
                "2. Take one in the face and shoot them both\n" +
                "3. Try and dodge";
        else if (storyX == 7) return "\"UGH, your a harder kill than we thought.\" " +
                "Two whips are being whipped at you.\n" +
                "1. Take a whipping like the loser you are\n" +
                "2. Catch both whips and shoot both\n" +
                "3. Lay down and die";
        else if (storyX == 8) return "Their final attack will be high pitched screaming.\n" +
                "1. SHUT UP AND KILL THEM BOTH\n" +
                "2. Run away and never look back\n" +
                "3. Lay down and die while your head hurts";
        else if (storyX == 9) return "The Twins explode and they slink back to whatever place they need to be.\n" +
                "You hear a dark rumbling and a man  in western dark garb approaches. You hear him whisper something you can't understand. Then silence.\n" +
                "You realize that this \"man\", is not a man. He is 10 feet tall,  and you understand nothing. Even your own thoughts are turning to gibberish.\n" +
                "Your sight is becoming blurred. This Thing is in your head.\n" +
                "The last thing you realize is that you will have to guess what you want to do, since you don't know what you will be doing anymore.\n" +
                "1.@$#%^YTVCJFDRT\n" +
                "1. Ymg''ll ah'mglw'nafh\n" +
                "2. Ymg''ll ah'mglw'nafh\n" +
                "3. Ymg''ll ah'mglw'nafh";
        else if (storyX == 10) return "2.@#$%^&*(&^%$##&*&*\n" +
                "1. Ahh ymg' ah mgephai geb\n" +
                "2. Ahh ymg' ah mgephai geb\n" +
                "3. Ahh ymg' ah mgephai geb";
        else if (storyX == 11) return "3.$%^&UYGTFYR$^%&^&*(\n" +
                "1. Zhro ya\n" +
                "2. Zhro ya\n" +
                "3. Zhro ya";
        else if (storyX == 12) return "4.$%^&*(UIYUGTFR^$\n" +
                "1. Fahf ah weird nafl l' bug ah'legeth\n" +
                "2. Fahf ah weird nafl l' bug ah'legeth\n" +
                "3. Fahf ah weird nafl l' bug ah'legeth";
        else if (storyX == 13) return "\"You see black everywhere, yet you somehow see the black being evaporate. Then nothing.\"\n" +
                "You don't feel anything. However, you her a voice talking to you:\n" +
                "\"Hello. You died. I have existed forever.\n" +
                "I had put you in a loop, to attempt to kill me. I was that Thing, as you had called me.\n" +
                "The loop was supposed to be impossible to complete, yet you completed it.\n" +
                "Congratulations. For your feat, I have ended the loop. I will allow you to experience death now.\"";
        else return "";
    }
    public int correct(){
        int correct = 0;
        if (storyX==3) correct = 1;
        else if (storyX == 4) correct = 2;  //defines what the correct answer for each question is.
        else if (storyX == 5) correct = 3;
        else if (storyX == 6) correct = 2;
        else if (storyX == 7) correct = 2;
        else if (storyX == 8) correct = 1;
        else if (storyX == 9) correct = 2;
        else if (storyX ==10) correct = 1;
        else if (storyX ==11) correct = 3;
        else if (storyX ==12) correct = 3;
        return correct;
    }
}