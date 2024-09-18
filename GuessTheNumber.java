import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100);

        System.out.println("******************************************************************");
        System.out.println("**** You have 5 lives for win the game ***************************");
        System.out.println("******************************************************************");
        int i=0;
        while (true)
        {
            i++;
            System.out.print("Enter the number 🥺🥺 : ");
            int userInp = scanner.nextInt();
            if(userInp == number)
                System.out.println("You Won this Game! 🥳🥳 ");
            else if (userInp>number) {
                System.out.println("Please Enter smaller number ");
            } else if (userInp<number) {
                System.out.println("Please Enter larger number ");
            }
            if(i>5){
                System.out.println("You Loose the Game ! Please Try Again");
                System.out.println("Number is : "+number);
                System.out.println("🥹🥹");
                break;
            }
        }
    }
}
