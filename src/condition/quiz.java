package condition;


import java.util.Locale;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner ready = new Scanner(System.in);
        System.out.println("Are you ready for a quiz? ");
        String the_ready = ready.nextLine().toLowerCase(Locale.ROOT);

        if(the_ready.equals("y") ||the_ready.equals("yes") ){
            System.out.println("Okay, here it comes!");
        }else{
            System.out.println("I don't care, just do it");
        }
        String prompt1 = """
                Q1) WHat is the df/dx of f(x) = (2x^2-1)^13
                    A)52x(2x^2-1)^12
                    B)13(2x^2-1)^12
                    C)(4x-1)^13""";
        String prompt2 = """
                Q2) What is the Capital of China
                    A)Shanghai
                    B)Beijing
                    C)Hangzhou""";
        String prompt3 = """
                Q3) What is the level of Misaka Mikoto?
                    A)4
                    B)5
                    C)6""";
        String[] prompt_list ={prompt1,prompt2,prompt3};
        String[] answer = {"A", "B", "B"};
        int num = 0;

        for(int i = 0; i<3; i++){
            String promptS = prompt_list[i];
            Scanner answerU = new Scanner(System.in);
            System.out.println(promptS);
            String answerInput = answerU.nextLine();
            if (answerInput.equals(answer[i])){
                System.out.println("That's right");
                num++;
            }else{
                System.out.println("That's wrong, Answer is  " + answer[i]);
            }

        }
        System.out.println("Over all, you got " + num +" over 3.");
        System.out.println("Thanks for playing");

    }
}
