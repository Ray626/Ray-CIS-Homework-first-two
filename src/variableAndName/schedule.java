package variableAndName;

import java.util.Arrays;

public class schedule {
    public static void main(String[] args) {
        String firstAndLastLine = "+" + "-".repeat(48) + "+";
        String block1 = "Pre-Calculus";
        String block2 = "AP Calculus";
        String block3 = "English";
        String block4 = "CIS";
//tb# stands for teacher of block#
        String tb1 = "Mrs.Reed";
        String tb2 = "Mrs.Reed";
        String tb3 = "Mrs.Silver";
        String tb4 = "Mr.Zaremba";
        String[][] schedule = {{block1,tb1},{block2,tb2},{block3,tb3},{block4,tb4}};
        System.out.println(firstAndLastLine);
        for(int i = 0; i < 4; i++){
            System.out.println("| "+(i+1) +" |"+" ".repeat(26-schedule[i][0].length()) +schedule[i][0]+ " |"+ " ".repeat(15-schedule[i][1].length()) + schedule[i][1]+" |");
        }
        System.out.println(firstAndLastLine);

        }
    }

