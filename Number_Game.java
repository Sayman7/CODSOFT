import java.io.*;
public class Number_Game{
    public static void main(String[] args)throws IOException {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int guess=0,chances=5,randNum=0,score=0;
        boolean playAgain=true;
        String moreRound="";
        //Welcome message
        System.out.println("Hi, I welcome you to a fun game where you have to guess a number");
        System.out.println("If your guess matches the number choosen by computer, you'll win!!!");
        System.out.println("You have 5 chances"); //Limit of trials
        randNum= (int)(Math.random() * 100) + 1; //first choice of the computer
        while(playAgain){ //Main code of the game
         if(chances==0) //Game over
         {
          System.out.println("Sorry, but you loose the game!!!");
          System.out.println("The number choosen by computer was: "+randNum);
          randNum= (int)(Math.random() * 100) + 1; //Changing computer's choice for new game
         }
         else{
         if(chances<5)
         System.out.println("You have "+chances+" chances left");
         System.out.print("Enter your guess: ");
         guess= Integer.parseInt(in.readLine());
         if(guess==randNum) //Winning logic
         {
            System.out.println("Yeahhhh, you won the Game!!!");
            score++;

         }
         else if(guess>randNum){ //If guess is greater than computer choice
            System.out.println("Too high");
            chances--;
            continue;
         }
         else if(guess<randNum){ //If guess is less than the computer choice
            System.out.println("Too low");
            chances--;
            continue;
         }
         }
         System.out.println("Do you want to play the game again (Y/N)?: ");
         moreRound= in.readLine();
         if(moreRound.equalsIgnoreCase("Y")||moreRound.equalsIgnoreCase("YES"))
          chances=5; //Restarting the game
        else if(moreRound.equalsIgnoreCase("N")||moreRound.equalsIgnoreCase("NO"))
        { //Displaying the score as the user don't want to play more
         System.out.println("Your score: "+score);
         System.out.println("Thanks for your time, I hope you enjoyed the game!!!");
         playAgain= false;
        }
        }
    }
}