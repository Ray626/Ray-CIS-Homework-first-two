package assignment.debug;
import java.util.Arrays;
import java.util.Locale;

public class Main {
        //Code your solution to problem number one here
        static int problemOne(String s){
            //TODO;
            s = s.toLowerCase(Locale.ROOT);
            String[]sSplit = s.split("");
            int num = 0;
            for(int i = 0; i<s.length();i++){
                if(sSplit[i].equals("a") || sSplit[i].equals("e") || sSplit[i].equals("i") || sSplit[i].equals("o") || sSplit[i].equals("u")){
                    num += 1;
                }
            }

            return num;
        }
        //Code you problem number two here
        static int problemTwo(String s){
            //TODO
            s = s.toLowerCase(Locale.ROOT);
            String[]sSplit = s.split("");
            int num = 0;
            for(int i = 0; i<s.length();i++){
                if(sSplit[i].equals("b") && i+2 < s.length()){

                    if(sSplit[i+1].equals("o")){
                        if(sSplit[i+2].equals("b")){
                            num += 1;
                        }
                    }
                }
            }

            return num;
        }
        //Code your solution to problem number 3 here
        static String problemThree(String s){
            //TODO
            s = s.toLowerCase(Locale.ROOT);
            String[] arrayTrend = new String[s.length()];
            for(int i = 0; i < s.length(); i++){
                int position = i+1;
                String numberThree = "";
                int num = i;
                char firstChar = s.charAt(num);

                numberThree += firstChar;
                if (position < s.length()){
                    while(firstChar <= s.charAt(position)){

                        numberThree =numberThree +=  s.charAt(position);
                        if (position+1 >= s.length()){
                            break;
                        }
                        num++;
                        firstChar = s.charAt(num);
                        position++;
                    }
                }

                arrayTrend[i] = numberThree;

            }
            int num = 0;
            String theFinal = "";
            for (String value : arrayTrend) {
                if (value.length() > num) {
                    theFinal = value;
                    num = value.length();
                }

            }

            return theFinal;
        }
        public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */

        }
    }

