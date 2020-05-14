/*IncorrectAnswer.java
 *Alessandro Krapf, Luke Langius, and Safwan Ahmad
 * 5/13/2020
 * CECFC/FRCC Java 160
 * This program displays a String that shows whenever you get something wrong, and defines a boolean for checking if something is wrong. It works for the main class.
 */
public class IncorrectAnswer {
    public boolean rightOrWrong;
    public String incorrect() {
        String incorrect= "";
        if (!this.rightOrWrong) incorrect = "You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.\n";
        //this will display when the user enters an incorrect answer
        return incorrect;
    }
}