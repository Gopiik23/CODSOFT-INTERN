package TASK1;
import java.util.Scanner;
import java.util.Random;
public class Guessgame{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomnumber = random.nextInt(101);
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
        System.out.println("LETS START THE GAME.....");
        int attempt=0;
        int guess;
        do{
            System.out.println("Enter your guess--->");
            guess = in.nextInt();
            attempt++;
            if(guess > randomnumber){
                System.out.println("OOPS...!!! YOUR GUESS IS HIGHER ");
            }
            else if(guess < randomnumber){
                System.out.println("OOPS...!!! YOUR GUESS IS LOWER ");
            }
            else{
                System.out.println("HURRAY...!! YOU HAVE GUESSED THE CORRECT NUMBER");
            }
        }while( guess != randomnumber);
        System.out.println("YOU TOOK "+attempt+" `ATTEMPTS");
    }
}