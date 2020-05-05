public class theChoice {
    public String choice() {
        thePlot s = new thePlot();
        String choice="";
        if (s.storyX == 3) {choice = "A";}
        if (s.storyX == 4) {choice = "B";}
        if (s.storyX == 5) {choice = "C";}
        if (s.storyX == 6) {choice = "B";}
        if (s.storyX == 7) {choice = "B";}
        if (s.storyX == 8) {choice = "A";}
        if (s.storyX == 9) {choice = "B";}
        if (s.storyX ==10) {choice = "A";}
        if (s.storyX ==11) {choice = "C";}
        if (s.storyX ==12) {choice = "C";}
        return choice;
    }
}