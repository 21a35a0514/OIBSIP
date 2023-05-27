import java.util.Scanner;
import java.util.Random;

public class Game
{ static int genrandom,ch=0;
static int guess,score;
   
    public static void gtn()
    {
         Scanner sc = new Scanner(System.in);
        Random random = new Random();
        genrandom = random.nextInt(100);
        int chance=5;
        for(int i=0;i<chance;i++)
        {
    System.out.println("Enter a number in range 1-100 :");
    guess=sc.nextInt();
    if(guess==genrandom)
    {
    System.out.println("You win");
    if(i==0||i==1){
    score=5;}
    else if(i==2){
    score=3;}
    else{
        score=2;
    }
    System.out.println("Your score is:"+score);
    break;
    }
    else if(guess<genrandom)
    {
     System.out.println("Random number is greater than guessed one");
    }
    else if(guess>genrandom)
    {
         System.out.println("Random number is lesser than guessed one");
    }
        
    if(i==chance-1){
    System.out.println("Random number "+genrandom+" doesn't match your guess");
    System.out.println("chance exceeds!! Better luck next time");
    }
        }
    }
    public static int Exit()
    {
        System.out.println("THANK YOU");
    return 0;
    }
    public static void main(String args[])
    { int choice=0;
        int round=1;
        
     Scanner sc = new Scanner(System.in);
     
         System.out.println("WELCOME");
System.out.println("GUESS THE NUMBER");
        System.out.println("Guess the correct one in 5 attempts");
        System.out.println("Enter 1.Begin 2.Exit");
        ch=sc.nextInt();
        do
     {
        switch(ch)
        {
            case 1:
                {
                gtn();
                break;
                }
            case 2:
                {
                    System.out.println("Thank you!!");
                    System.exit(0);
                    break;
                }
                default: System.out.println("Please enter valid option");
        }
        if(score>=1)
        {
            round++;
            System.out.println("Congrats you are qualified for ROUND"+round);
        }
        System.out.println("Do you want to continue:");
        System.out.println("Enter 1:yes or 2:no");
        choice=sc.nextInt();
     }
   while(choice==1);
   if(choice==2)
   Exit();
    }
}