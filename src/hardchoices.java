/*hardchoices.java
Alessandro Krapf, Luke Langius, and Safwan Ahmad
5.6.2020
java 160
This program first displays a String that shows whenever you get something wrong. Then the program restarts the game if that String was displayed.
It works for the main class.
 */
public class hardchoices {
    public boolean loop2;
    public String wrongChoice="You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.\n";
    public String incorrect() {
        String incorrect= "";  //if user input is correct, then displays nothing. if incorrect, then displays text saying so.
        if (!this.loop2) incorrect = wrongChoice;
        return incorrect;
    }
}