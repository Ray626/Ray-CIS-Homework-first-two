package assignment.forAndWhileLoops;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
//All the ascii art I used in this game are all from the GitHub user "Grace xerilius"
public class rockPaperScissors {
    // This method is deciding either the player wins or loses. 0 = draw, 1 = win, 2 = lose, 3 = error
    static int winOrLose(int user, int computer) {
        if (user == computer) {
            return 0;
        } else if (user == 1 && computer == 2) {
            return 2;
        } else if (user == 1 && computer == 3) {
            return 1;
        } else if (user == 2 && computer == 3) {
            return 2;
        } else if (user == 2 && computer == 1) {
            return 1;
        } else if (user == 3 && computer == 1) {
            return 2;
        } else if (user == 3 && computer == 2) {
            return 1;
        } else {
            return 3;
        }
    }
    //This method decide either the player want to play again o quit the game. 0 = play again, 1 = quit
    static int playAgain() {
        System.out.println("Do you want to play again? (Yes/No)");
        while (true) {
            Scanner again = new Scanner(System.in);

            String again_result = again.nextLine().toLowerCase(Locale.ROOT);

            if (again_result.equals("yes")) {
                return 0;
            }
            if (again_result.equals("no")) {
                return 1;
            } else {
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
        String option = """
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
        //assignment.array that stores rock paper and scissors
        String[] rPS = {rock, paper, scissors};
        //assignment.array that stores result
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
        //Variables count the winning rounds and the losing rounds
        int win = 0;
        int lose = 0;
        //repeat if the user input is invalid
        //label:
        while (true) {
            Scanner player_choice = new Scanner(System.in);
            String the_player_choice = player_choice.nextLine().toLowerCase(Locale.ROOT);
            Random rand = new Random();
            int computerChoiceInt = rand.nextInt(3) + 1;
            //Showing the graphical result of Rock, Paper, Scissors
            if (the_player_choice.equals("1") || the_player_choice.equals("2") || the_player_choice.equals("3")) {
                int thePlayerChoice = Integer.parseInt(the_player_choice);
                System.out.println("Player:\n" + rPS[thePlayerChoice - 1]);
                System.out.println("Computer:\n" + rPS[computerChoiceInt - 1]);
                int resultNum = winOrLose(thePlayerChoice, computerChoiceInt);
                System.out.println(result[resultNum]);
                if (resultNum == 1) {
                    win++;
                } else if (resultNum == 2) {
                    lose++;
                }
                System.out.println("Win: " + win + "  Lose: " + lose);
                //get the int value of playAgain
                againOrNot = playAgain();
                //break the loop if player decide to quit
                if (againOrNot == 1) {
                    System.out.println(gameOver);
                    break;
                }
                //reprint the question if player decide to play again
                else if (againOrNot == 0) {
                    System.out.println(option);
                }
            } else {
                System.out.println("Your input is invalid, please enter again");
            }
        }
    }
}

