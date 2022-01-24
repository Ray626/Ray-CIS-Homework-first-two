package assignment.readingText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    /**
     * @param word is a word that is searching in the text
     * @param wordLine is an arrayList provide all the lines of the text
     */
    static void searchWords (String word,ArrayList<String>wordLine) {

        for (int index = 0; index < wordLine.size(); index++) {
            String line = wordLine.get(index);
            //line = line.replaceAll("\\p{Punct}", " ");
            String[] wordInLine = line.replaceAll("\\p{Punct}", "").split("\\s");
            for (int i = 0; i < wordInLine.length; i++){
                if(wordInLine[i].equals(word)){
                    System.out.println(word.toUpperCase(Locale.ROOT) + " appeared at the index position "  + i + " on the " + (index+1) + " ine");
                }
            }


        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr =  new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            lines.add(line);
        }
        br.close();
        searchWords("program",lines);
        searchWords("the",lines);



    }
}
