import java.util.Scanner;
public class Storytime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hardchoices x = new hardchoices();
        thePlot s = new thePlot();
        String name, choice;
        boolean loop  = false;
        do{
            System.out.println("What is your name?");
            name = input.nextLine();
            System.out.println(s.Story1());
            choice = input.nextLine();
            if (!choice.equals("Y")) System.out.println("It does not matter.");
            System.out.println(s.Story2());
            choice = input.nextLine();
            for (int a=3; a<=13; a++){
                s.storyX=a;
                System.out.println(s.Stories());
                choice=input.nextLine();
                x.loop2= choice.equals(s.correct());
                System.out.print(x.hardchoice());
                if (x.restart()) { loop=true;
                    break;
                }
        }
        } while (loop);
    }
}