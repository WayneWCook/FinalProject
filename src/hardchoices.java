public class hardchoices {
    public boolean loop2;
    public String hardchoice() {
        String wrong = "";
        if (!this.loop2) { wrong = "You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.\n"; }
        return wrong;
    }
    public boolean restart() {
        boolean restart;
        restart = this.hardchoice().equals("You suddenly realize you are in a ghost town. You don't remember anything, only know that you must fight and win whoever you encounter.\n");
            return restart;
    }
}