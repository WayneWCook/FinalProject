import java.util.Scanner;
public class Storytime {
    public boolean loop  = true;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hardchoices x = new hardchoices();
        thePlot s = new thePlot();
        Storytime y = new Storytime();
        String name, choice;
        do{
            System.out.println("What is your name?");
            name = input.nextLine();
            System.out.println(s.Story1());
            choice = input.nextLine();
            x.loop2= choice.equals("Y");
            System.out.print(x.choice());
            System.out.println(s.Story2());
            choice = input.nextLine();
            if (choice.equals("C"))System.out.println("Well, " + name + s.Story3());
            else System.out.println("Well, whoever you are" + s.Story3());
            choice = input.nextLine();
            x.loop2= choice.equals("A");
            System.out.print(x.choice());
            for (int a=4; 4<=a && a<12; a++){
                s.storyX=a;
                System.out.println(s.Stories());
                choice=input.nextLine();
                x.loop2= choice.equals("B");
                System.out.print(x.choice());
        }
            System.out.println(s.Story12());
            choice = input.nextLine();
            System.out.println("You see black everywhere, yet you somehow see the black being evaporate. Then nothing.");
            if (!choice.equals("A") && !choice.equals("B") && !choice.equals("C")) {x.loop2=false;
            System.out.println(s.StorySuccess());}
            else x.loop2=true;
            System.out.print(x.choice());
        } while (y.loop);
    }
}