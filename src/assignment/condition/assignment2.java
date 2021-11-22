package assignment.condition;
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner theName = new Scanner(System.in);
        System.out.println("Hey, what is your name?");
        String userName = theName.nextLine();
        System.out.println("Ok, " + userName + ", how old are your?");
        Scanner theAge = new Scanner(System.in);
        int userAge = theAge.nextInt();
        if(userAge < 16){
            System.out.println("You can't drive, "+ userName + ".");
        }
        else if(userAge <=17){
            System.out.println("You can drive but not vote, " + userName + ".");
        }
        else if(userAge<=24){
            System.out.println("You can drive but not renting a car, " + userName + ".");
        }
        else{
            System.out.println("You can do pretty much thing, "+ userName + ".");
        }
        
    }
}
