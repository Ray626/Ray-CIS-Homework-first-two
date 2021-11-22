package assignment.condition;

import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        double[] gravity ={0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
        Scanner theWeight= new Scanner(System.in);
        System.out.println("Please enter your current earth weight: ");
        double weight = theWeight.nextDouble();
        System.out.println("I have information for the following planets:");
        System.out.println(" ".repeat(5) + "1. Venus" + " ".repeat(4) + "2. Mars" + " ".repeat(5) + "3. Jupiter");
        System.out.println(" ".repeat(5) + "4. Saturn" + " ".repeat(3) + "5. Uranus" + " ".repeat(3) + "6.Neptune");
        Scanner place = new Scanner(System.in);
        System.out.println("Which planet are you visiting? ");
        int placeNum = place.nextInt();
        if(placeNum == 1){
            double num = gravity[0]* weight;
            System.out.println("Your weight would be " + num + " pounds on that planet.");
        }else if(placeNum == 2){
            double num = gravity[1]* weight;
            System.out.println("Your weight would be " + num + " pounds on that planet.");
        }else if(placeNum == 3){
            double num = gravity[2]* weight;
            System.out.println("Your weight would be " + num + " pounds on that planet.");
        }else if(placeNum == 4){
            double num = gravity[3]* weight;
            System.out.println("Your weight would be " + num + " pounds on that planet.");
        }else if (placeNum == 5){
            double num = gravity[4]* weight;
            System.out.println("Your weight would be " + num + " pounds on that planet.");
        }else if (placeNum == 6){
            double num = gravity[5]* weight;
            System.out.println("Your weight would be " + num + " pounds on that planet.");
        }else{
            System.out.println("The place is invalid");
        }

    }




}
