public class hardchoices {
    public boolean loop2;
    public String choice() {
        String wrong = "";
        if (!this.loop2) { wrong = "You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.\n"; }
        return wrong;
    }
    public boolean choices() {
        boolean wrong;
        wrong = this.choice().equals("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.\n");
            return wrong;
    }
}