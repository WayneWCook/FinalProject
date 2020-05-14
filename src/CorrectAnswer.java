/*CorrectAnswer.java
 *Alessandro Krapf, Safwan Ahmad, and Luke Langius
 * 5/13/2020
 * CECFC/FRCC Java 160
 * This class defines the correct answers for the game. It extends ThePlot, and works for the main class.
 */
public class CorrectAnswer extends ThePlot{
    public boolean correct(int choice){
        int[] correctAnswer = {0,0,0,1, 2, 3, 2, 2, 1, 2, 1, 3, 3};    //lists all correct answers. starts with 3 0's because the array isn't activated till the 3rd option.
        return (choice==correctAnswer[storyNum]);  //if user input is correct, the correct() will be true.
    }
}
