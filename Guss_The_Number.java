import java.util.Scanner;
import java.util.Random;

class game {
    Random rc = new Random();
    int num;
    int r = rc.nextInt(1,
            100);
    boolean b1 = true;

    int cc = 0;

    public void instruction() {
        System.out.println("(1)Enter number between 1 to 100");
        System.out.println("(2)If difference between entered number and original number is less than 5 you get \"Pretty Close!\" as output");
        System.out.println("(3)If difference between entered number and original number is less than 10 you get \"Very close!\" as output");
        System.out.println("(4)If difference between entered number and original number is less than 20 you get \"close!\" as output");
        System.out.println("(5)If difference between entered number and original number is less than 30 you get \"Far!\" as output");
        System.out.println("(6)If difference between entered number and original number is less than 10 you get \"Very Far!\" as output");
        System.out.println("(7)Enter 0 to Exit the game");
    }

    public int random() {

        return r;
    }

    public void input(int number) {

        num = number;
    }

    public void score() {

    }

    public void check() {

        if (num == 0) {
            cc = 0;
        } else if (num == r) {
            cc = 1;

        } else if (Math.abs(num - r) <= 5) {
            cc = 2;

        } else if (Math.abs(num - r) <= 10) {
            cc = 3;

        } else if (Math.abs(num - r) <= 20) {
            cc = 4;

        } else if (Math.abs(num - r) <= 30) {
            cc = 5;

        } else {
            cc = 6;

        }

        switch (cc) {
            case 0:
                return;
            case 1:
                System.out.println("Number Match");
                break;
            case 2:
                System.out.println("Pretty Close!");
                break;
            case 3:
                System.out.println("Very close!");
                break;
            case 4:
                System.out.println("Close!");
                break;
            case 5:
                System.out.println("Far!");
                break;
            case 6:
                System.out.println("Very Far!");
                break;

        }
    }
}

public class Guss_The_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game g1 = new game();
        int count = 0;
        String name;

        System.out.println("Guess The Number");
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
        System.out.println("Hello " + name + "! Welcome To The Game");
        System.out.println("HELP INSTRUCTION");
        g1.instruction();
        System.out.println("Enter 1 to START the game\nEnter 0 to END the game");

        int input = sc.nextInt();
        switch (input) {

            case 1: {
                while (true) {
                    System.out.print("Enter Number : ");
                    int n1 = sc.nextInt();
                    g1.input(n1);

                    g1.check();

                    if (g1.cc == 0 || g1.cc == 1) {
                        break;
                    }
                    count++;
                }
                System.out.println("Your Score = " + count);
                break;
            }
            case 0: {
                return;
            }
        }
    }
}
