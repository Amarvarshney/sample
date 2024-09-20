import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        // 0 for paper
        // 1 for rock
        // 2 for scissor
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers 0 paper,1 rock,2scissor");
        int uservalue=sc.nextInt();
        Random random = new Random();
        int computerchoice=random.nextInt(3);
        if(uservalue==computerchoice){
            System.out.println("It's Draw");
        }
        else if(uservalue==0 && computerchoice==1 || uservalue==1  && computerchoice==2 ||
         uservalue==2 && computerchoice==0){
            System.out.println("You Win");
        }
        else{
            System.out.println("computer Win");
        }
        System.out.println("computer input is : " +  computerchoice );
        sc.close();

    }
}
