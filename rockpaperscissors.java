import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choice = {"rock", "paper", "scissors"};
        int userscore = 0;
        int computerscore = 0;
        System.out.println("Total of 3 rounds will be played. Whoever wins 2 rounds will be the winner");

        for(int i = 1; i<=3; i++){
            System.out.println("Round "+ i +" Enter your move(rock/paper/scissors): ");
            String userchoice = sc.next().toLowerCase();

            int computermove = rand.nextInt(3);
            String computerchoice = choice[computermove];

            System.out.println("Computer choice: "+computerchoice);
            
            if(userchoice.equals(computerchoice)){
                System.out.println("It's a tie");
            } else if (userchoice.equals("rock")) {
                if(computerchoice.equals("scissors")){
                    System.out.println("You win this round");
                    userscore++;
                }
                else {
                    System.out.println("computer win this round");
                    computerscore++;
                }
                
            } else if (userchoice.equals("paper")) {
                if(computerchoice.equals("rock")){
                    System.out.println("you win this rouond");
                    userscore++;
                }
                else{
                    System.out.println("Computer win this round");
                    computerscore++;
                }

            } else if (userchoice.equals("scissors")) {
                if(computerchoice.equals("paper")){
                    System.out.println("You win this round");
                    userscore++;
                }
                else{
                    System.out.println("Computer win this round");
                    computerscore++;
                }

            }
            else{
                System.out.println("Invalid input! Round Skipped");
            }

        }

        System.out.println("Final Score");
        System.out.println("Your Socre: "+userscore);
        System.out.println("Computer Score: "+computerscore);

        if(userscore>computerscore){
            System.out.println("You are the winner");
        } else if (userscore<computerscore) {
            System.out.println("Computer wins the game");
        }
        else{
            System.out.println("It's a draw");
        }

    }
}
