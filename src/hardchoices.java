public class hardchoices {
    public boolean loop2;
    public String choice() {
        String wrongg;
        String wrong = "You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.";
        if (!this.loop2) { wrongg = wrong; }
        else {wrongg="";}
        return wrongg;
    }
    public boolean choices() {
        boolean wrong;
        wrong = !this.choice().equals("\"\\nYou suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.\"");
            return wrong;
    }
}