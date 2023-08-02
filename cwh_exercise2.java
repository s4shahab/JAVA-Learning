import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;
public class cwh_exercise2 {
    public static void main(String[] args) {
//        Rock, paper Scissors game

//        --Rock beats Scissors
//        --Scissor beats paper
//        --Peper beats rock

        int computerScore=0;
        int userScore=0;

        int count=1;







        while (count<=5) {

            System.out.println("Enter 1 for Rock");
            System.out.println("Enter 2 for Scissor");
            System.out.println("Enter 3 for Paper");

            Random rand=new Random();
            int compInput= rand.nextInt(1,4);

            Scanner sc=new Scanner(System.in);
            int userInput=sc.nextInt();

            if (userInput == compInput) {
//                System.out.println("The match is tie");
                computerScore += 0;
                userScore += 0;
            } else if (userInput == 1 && compInput == 2) {
//                System.out.println("user won ");
                computerScore += 0;
                userScore += 1;

            } else if (userInput == 1 && compInput == 3) {
//                System.out.println("Computer won");
                computerScore += 1;
                userScore += 0;

            } else if (userInput == 2 && compInput == 3) {
//                System.out.println("user won");
                computerScore += 0;
                userScore += 1;
            } else if (userInput == 2 && compInput == 1) {
//                System.out.println("Computer won");
                computerScore += 1;
                userScore += 0;

            } else if (userInput == 3 && compInput == 1) {
//                System.out.println("user won");
                computerScore += 0;
                userScore += 1;
            } else if (userInput == 3 && compInput == 2) {
//                System.out.println("computer won");
                computerScore += 1;
                userScore += 0;
            }

            count+=1;
        }
        System.out.println("Computer score is :"+computerScore);
        System.out.println("User score is :"+userScore);

        if(userScore==computerScore){
            System.out.println("The match is tie");
        }
        else if (userScore>computerScore){
             System.out.println("user won");
        }

        else {
            System.out.println("Computer won");
        }

    }
}
