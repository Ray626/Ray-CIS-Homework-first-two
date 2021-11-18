package condition;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
//All the ascii art I used in this game are all from the GitHub user "Grace xerilius"
public class rockPaperScissors {
    // This method is deciding either the player wins or loses. 0 = draw, 1 = win, 2 = lose, 3 = error
    static int winOrLose(String user, String computer) {
        if (user.equals(computer)){
            return 0;
        }else if(user.equals("1")&& computer.equals("2")){
            return 2;
        }else if(user.equals("1")&& computer.equals("3")){
            return 1;
        }else if(user.equals("2")&& computer.equals("3")){
            return 2;
        }else if(user.equals("2")&& computer.equals("1")) {
            return 1;
        }else if(user.equals("3")&& computer.equals("1")){
            return 2;
        }else if(user.equals("3")&& computer.equals("2")) {
            return 1;
        }else{
            return 3;
        }
    }
    //This method decide either the player want to play again o quit the game. 0 = play again, 1 = quit
    static int playAgain(){
        System.out.println("Do you want to play again? (Yes/No)");
        while (true){
        Scanner again = new Scanner(System.in);

        String again_result = again.nextLine().toLowerCase(Locale.ROOT);

        if(again_result.equals("yes")){
            return 0;
        }if (again_result.equals("no")){
            return 1;
        }else{
                System.out.println("Your input is invalid, please enter again");
            }
        }
    }
    public static void main(String[] args) {
        //Title
        System.out.println("""
                ██████╗  ██████╗  ██████╗██╗  ██╗    ██████╗  █████╗ ██████╗ ███████╗██████╗     ███████╗ ██████╗██╗███████╗███████╗ ██████╗ ██████╗ ███████╗
                ██╔══██╗██╔═══██╗██╔════╝██║ ██╔╝    ██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗    ██╔════╝██╔════╝██║██╔════╝██╔════╝██╔═══██╗██╔══██╗██╔════╝
                ██████╔╝██║   ██║██║     █████╔╝     ██████╔╝███████║██████╔╝█████╗  ██████╔╝    ███████╗██║     ██║███████╗███████╗██║   ██║██████╔╝███████╗
                ██╔══██╗██║   ██║██║     ██╔═██╗     ██╔═══╝ ██╔══██║██╔═══╝ ██╔══╝  ██╔══██╗    ╚════██║██║     ██║╚════██║╚════██║██║   ██║██╔══██╗╚════██║
                ██║  ██║╚██████╔╝╚██████╗██║  ██╗    ██║     ██║  ██║██║     ███████╗██║  ██║    ███████║╚██████╗██║███████║███████║╚██████╔╝██║  ██║███████║
                ╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝    ╚═╝     ╚═╝  ╚═╝╚═╝     ╚══════╝╚═╝  ╚═╝    ╚══════╝ ╚═════╝╚═╝╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝
                """);
        //variables of Rock, paper and scissors
        String option ="""
                Choose one:
                1)Rock
                2)Paper
                3)Scissors""";
        String scissors = """
                     _
                    | | / )
                    | |/ /
                   _|__ /_
                  / __)-' )
                  \\  `(.-')
                   > ._>-'
                  / \\/
                """;
        String paper = """
                            ___..__
                ____..--'''' ._ __.'
                              "-..__
                            '"--..__";
                ____        '--...__"";
                    `-..__ '"---..._;"
                          ''''---"
                """;
        String rock = """
                          ,--.--._
                ---------" _, \\___)
                           / _/____)
                           \\//(____)
                ---------\\     (__)
                          `-----"
                """;
        //array that stores rock paper and scissors
        String[] rPS = {rock,paper,scissors};
        //array that stores result
        String[] result = {"""
             ██████╗ ██████╗  █████╗ ██╗    ██╗
             ██╔══██╗██╔══██╗██╔══██╗██║    ██║
             ██║  ██║██████╔╝███████║██║ █╗ ██║
             ██║  ██║██╔══██╗██╔══██║██║███╗██║
             ██████╔╝██║  ██║██║  ██║╚███╔███╔╝
             ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚══╝╚══╝
            """, """
             ██╗    ██╗██╗███╗   ██╗
             ██║    ██║██║████╗  ██║
             ██║ █╗ ██║██║██╔██╗ ██║
             ██║███╗██║██║██║╚██╗██║
             ╚███╔███╔╝██║██║ ╚████║
            
            """, """
             ██╗     ██████╗ ██████ ████████╗
             ██║    ██╔═══██ ██╔════██ ╔════╝
             ██║    ██║   ██ ██████ ██████╗
             ██║    ██║   ██╚════██ ██ ╔══╝
             ███████╚██████ ╔██████ ████████
            """};
        //pops up when quits the game
        String gameOver = """
                 ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗
                ██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗
                ██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝
                ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗
                ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║
                 ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝
                """;
        //variable decide which user intend to play again or end the game
        int againOrNot;

        //user's option
        System.out.println(option);

        //repeat if the user input is invalid
        label:
        while (true ){
            Scanner player_choice = new Scanner(System.in);
            String the_player_choice = player_choice.nextLine().toLowerCase(Locale.ROOT);
            Random rand = new Random();
            int computerChoiceInt = rand.nextInt(3)+1;
            String computerChoiceStr = Integer.toString(computerChoiceInt);

            //Showing the graphical result of Rock, Paper, Scissors
            switch (the_player_choice) {
                case "1" -> {
                    System.out.println("You:\n" + rPS[0]);
                    System.out.println("Computer:\n" + rPS[computerChoiceInt - 1]);
                    System.out.println(result[winOrLose(the_player_choice, computerChoiceStr)]);
                    //get the int value of playAgain
                    againOrNot = playAgain();
                    //break the loop if player decide to quit
                    if (againOrNot == 1) {
                        System.out.println(gameOver);

                        break label;
                    }
                    //reprint the question if player decide to play again
                    else if (againOrNot == 0) {
                        System.out.println(option);
                    }
                }
                case "2" -> {
                    System.out.println("You:\n" + rPS[1]);
                    System.out.println("Computer:\n" + rPS[computerChoiceInt - 1]);
                    System.out.println(result[winOrLose(the_player_choice, computerChoiceStr)]);
                    againOrNot = playAgain();
                    if (againOrNot == 1) {
                        System.out.println(gameOver);
                        break label;
                    } else if (againOrNot == 0) {
                        System.out.println(option);
                    }
                }
                case "3" -> {
                    System.out.println("You:\n" + rPS[2]);
                    System.out.println("Computer:\n" + rPS[computerChoiceInt - 1]);
                    System.out.println(result[winOrLose(the_player_choice, computerChoiceStr)]);
                    againOrNot = playAgain();
                    if (againOrNot == 1) {
                        System.out.println(gameOver);
                        break label;
                    } else if (againOrNot == 0) {
                        System.out.println(option);
                    }
                }
                default -> System.out.println("Your input is invalid, please enter again");
            }



        }
    }
}
