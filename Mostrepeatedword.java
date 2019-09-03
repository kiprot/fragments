import java.util.HashMap;
import java.util.*;

class Mostrepeatedword {


    public static String findMostRepeated(String s) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        String lower = s.toLowerCase().trim();
        String[] allWords = lower.split("[ \\n\\t\\r.,;:!?()]");

        System.out.println(Arrays.toString(allWords));

        for(String k : allWords) {
            if(wordCount.containsKey(k)) {
                wordCount.put(k, wordCount.get(k) + 1);
            } else {
                wordCount.put(k, 1);
            }
        }


        int max = 0;
        String mostRepeatedWord = "";

        for(String mapKey: wordCount.keySet()) {
            if(wordCount.get(mapKey) > max) {
                max = wordCount.get(mapKey);
                mostRepeatedWord = mapKey;
            }
        }

        System.out.println("Most repeated: " + mostRepeatedWord + "  Times: " + max);

        return mostRepeatedWord;

    }

    public static void main (String [] args) {

        String st = "Ken ken kip, kiprot";
        findMostRepeated(st);

    }


}