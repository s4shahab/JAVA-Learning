import java.util.Random;
import java.util.Scanner;
class Games{
    public int compInput;
    public int userInput;
    public int noOfGuesses=0;

    /*
    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;

    }

     */

    Games(){
        Random rand=new Random();
        this.compInput=rand.nextInt(100);


    }

    void takeuserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        userInput=sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (userInput==compInput){
            System.out.format("New--you guess it right, it was %d\n you guessed it in %d atempts",compInput,noOfGuesses);
            return true;
        } else if (userInput>compInput) {
            System.out.println("To High ...");

        } else if (userInput<compInput) {
            System.out.println("To low...");
        }
        return false;

    }
}

public class cwh_43_revision {
    public static void main(String[] args) {
        Games gg=new Games();
        boolean b=false;
        while (!b){
            gg.takeuserInput();
            b= gg.isCorrectNumber();
        }



    }
}

