import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class GenerateNumber{
    int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
    String output;
    public String getNumber() {
        if (randomNum == 1)
            output="p";

        else if(randomNum== 2)
            output="s";
        else if (randomNum== 3) {
            output="r";
        }
        return output;
    }
}

public class StonePaperScissor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userWin = 0;
        int computerWin = 0;
        int i=0;
        System.out.println("******************************************************************");
        System.out.println("**** Press s for Scissor *****************************************");
        System.out.println("**** Press p for Paper   *****************************************");
        System.out.println("**** Press r for Rock    *****************************************");
        System.out.println("**** Press q for Quit    *****************************************");
        System.out.println("**** Play 5 times for  Better Result *****************************");
        System.out.println("******************************************************************");
        GenerateNumber generateNumber = new GenerateNumber();
        while (i<5){
            i++;
            System.out.print("Enter Your Choice : ");
            String choice = scanner.next();
            if(choice.length()>1)
                System.out.println("Enter Only one Character");
            else if ("p".contains(choice)||"r".contains(choice)||"s".contains(choice)) {
                String num = generateNumber.getNumber();
                if (num.equals(choice))
                    System.out.println("Match Draw");
                else if ((num.equals("p") && choice.equals("s")) ||
                        (num.equals("s") && choice.equals("r")) ||
                        (num.equals("r") && choice.equals("p"))) {
                    System.out.println("You Win! 🙂🙂🙂");
                    userWin = userWin+1;
                } else{
                    System.out.println("You Lose! 🥲");
                computerWin = computerWin +1;}
            }
            else if("q".contains(choice)) {
                System.out.println("Thanks for playing! See you again.");
                break;
            }
            else
                System.out.println("Invalid Choice! Please try again.");
        }
        if(userWin>computerWin)
            System.out.println("You Win "+userWin+" Times");
        else if (userWin == computerWin) {
            System.out.println("Match Draw");
        } else {
            System.out.println("Final Result: .......... ");
            System.out.println("You Loose " + computerWin + " Times");
        }
    }

}
