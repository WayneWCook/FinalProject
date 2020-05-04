public class hardchoices {
    public String choice() {
        Storytime y = new Storytime();
        String Wrong;
        String wrong = "\nYou suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.";
        if (!y.loop2) { Wrong = wrong; }
        else {Wrong="";}
        return Wrong;
    }
}